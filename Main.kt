fun main(args: Array<String>) {
    println("Regex Test!"); println()

    val string = "전화번호 : 010-1234-5678, 사무실번호 : 02-1234-4321, 이름 : 김모씨, " +
            "주소 : 대전광역시 유성구 온천로 00100, 101동 200층, " +
            "이메일 : helloworld123@gmail.co.cor"

    // 전화번호
    val telRegex = Regex("\\d{2,3}-\\d{3,4}-\\d{4}")
    val telMatchResults: Sequence<MatchResult> = telRegex.findAll(string)
    println("전화번호 개수 : ${telMatchResults.count()}")
    telMatchResults?.forEach {
        println(it.value)
    }
    println()

    // 이메일
    val emailRegex = Regex("\\w+@\\w+\\.\\w+(\\.\\w+)")
    val emailMatchResults: Sequence<MatchResult> = emailRegex.findAll(string)
    println("이메일 개수 : ${emailMatchResults.count()}")
    emailMatchResults?.forEach {
        println(it.value)
    }
    println()

    // 휴대전화번호(010 시작)
    val phoneRegex = Regex("01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}")
    val phoneMatchResults: Sequence<MatchResult> = phoneRegex.findAll(string)
    println("휴대전화번호 개수 : ${phoneMatchResults.count()}")
    phoneMatchResults?.forEach {
        println(it.value)
    }
    println()

}
