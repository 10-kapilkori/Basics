package com.task.testcases

const val monthlyPay = 100

fun main() {
    val employee = Employee(12)

    with(employee) {
        val assignedTask = assigningTask(2, 3)
        val managedTask = managingTask(2, 0)
        val providedMentor = providingMentor(4)
        val recruitedMember = recruiting(2, 4)
        val totalWorkHrs = totalWorkHours(35)

        println(
            "AssignedTask:- $assignedTask\nManagedTask:- $managedTask\nProvidedMentor:- $providedMentor" +
                    "\nRecruitedMembers:- $recruitedMember\nTotalWorking Hours:- $totalWorkHrs"
        )
    }

    val hr = object : HR {
        override fun recruiting(newlyRecruitedMember: Int, lastlyRecruitedMember: Int): Int {
            return 0
        }

        override fun totalWorkHours(workingHrs: Int): Int {
            return 0
        }
    }

    hr.notifyingEmployee(2, 3)
}

abstract class TL {
    abstract fun assigningTask(work: Int, deadlineInDays: Int): String
    abstract fun managingTask(newTask: Int, oldTask: Int): String
    open fun providingMentor(numberOfTrainee: Int): Int {
        return if (numberOfTrainee > 0) numberOfTrainee * 2 else 0
    }
}

interface HR {
    fun recruiting(newlyRecruitedMember: Int, lastlyRecruitedMember: Int): Int
    fun totalWorkHours(workingHrs: Int): Int
    val compensation: Int
        get() = 10

    fun notifyingEmployee(totalTaskGiven: Int, deadlineForTask: Int = 1) {
        when (totalTaskGiven) {
            0 -> println("You will be notified with a new task shortly")
            in (1..3) -> println("The deadline for these task is $deadlineForTask")
            else -> println("No new task were given")
        }
    }
}

class Employee(override val compensation: Int = 12) : TL(), HR {
    override fun assigningTask(work: Int, deadlineInDays: Int): String {
        return if (work > 0) "The deadline for the work $work is $deadlineInDays" else "There is no work"
    }

    override fun managingTask(newTask: Int, oldTask: Int): String {
        var task = newTask
        if (oldTask > 0)
            task += oldTask

        return "Previous Task: $oldTask, New Task: $newTask, and the Total Task: $task"
    }

    override fun recruiting(newlyRecruitedMember: Int, lastlyRecruitedMember: Int): Int {
        return if (newlyRecruitedMember > lastlyRecruitedMember) newlyRecruitedMember else lastlyRecruitedMember
    }

    override fun totalWorkHours(workingHrs: Int): Int {
        return if (workingHrs > 40) monthlyPay * compensation else (compensation - (workingHrs / 5)) * monthlyPay
    }

    override fun providingMentor(numberOfTrainee: Int): Int {
        return when (numberOfTrainee) {
            in (0..2) -> 1
            in (3..5) -> 2
            else -> 0
        }
    }
}