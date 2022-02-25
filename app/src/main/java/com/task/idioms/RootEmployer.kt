package com.task.idioms

fun main() {
    val empList: MutableList<Employer> = mutableListOf<Employer>()

    empList.addAll(
        listOf(
            Employer(0, "ABC", 1, "UI/UX"),
            Employer(1, "DEF", 2, "Android Dev"),
            Employer(2, "HIJ", 5, "IOS Dev"),
            Employer(3, "KLM", 3, "HR Dept"),
        )
    )

    for (employer in empList) {
        if ("Ui/UX" in employer.department)
            println("He's been called for to introduce himself to others")
    }

    val employer: Employer by lazy {
        Employer(4, "NOP", 2, "HR")
    }

    empList.add(employer)
}
