class CNBInput {
    var input = "Česko]koruna]1]CZK]1\n" +
            "Austrálie]dolar]1]AUD]15.741\n" +
            "Brazílie]real]1]BRL]4.103\n" +
            "Bulharsko]lev]1]BGN]12.964\n" +
            "Čína]žen-min-pi]1]CNY]3.352\n" +
            "Dánsko]koruna]1]DKK]3.410\n" +
            "EMU]euro]1]EUR]25.355\n" +
            "Filipíny]peso]100]PHP]43.068\n" +
            "Hongkong]dolar]1]HKD]2.780\n" +
            "Chorvatsko]kuna]1]HRK]3.383\n" +
            "Indie]rupie]100]INR]29.355\n" +
            "Indonesie]rupie]1000]IDR]1.519\n" +
            "Island]koruna]100]ISK]16.714\n" +
            "Izrael]nový šekel]1]ILS]6.762\n" +
            "Japonsko]jen]100]JPY]19.671\n" +
            "Jižní Afrika]rand]1]ZAR]1.481\n" +
            "Kanada]dolar]1]CAD]17.077\n" +
            "Korejská republika]won]100]KRW]1.844\n" +
            "Maďarsko]forint]100]HUF]7.119\n" +
            "Malajsie]ringgit]1]MYR]5.175\n" +
            "Mexiko]peso]1]MXN]1.082\n" +
            "MMF]ZPČ]1]XDR]30.719\n" +
            "Norsko]koruna]1]NOK]2.514\n" +
            "Nový Zéland]dolar]1]NZD]15.255\n" +
            "Polsko]zlotý]1]PLN]5.500\n" +
            "Rumunsko]leu]1]RON]5.122\n" +
            "Rusko]rubl]100]RUB]29.747\n" +
            "Singapur]dolar]1]SGD]16.049\n" +
            "Švédsko]koruna]1]SEK]2.501\n" +
            "Švýcarsko]frank]1]CHF]23.411\n" +
            "Thajsko]baht]100]THB]65.077\n" +
            "Turecko]lira]1]TRY]2.474\n" +
            "USA]dolar]1]USD]21.641\n" +
            "Velká Británie]libra]1]GBP]29.659"

    fun getInput(): MutableMap<String,Float> {
        val exchangeRate = mutableMapOf<String, Float>()
        val input2 = input.split("\n").toTypedArray()
        for (x in input2.indices) {
            val output: Array<String> = input2[x].split("]").toTypedArray()
            exchangeRate[output[3]] = output[4].toFloat() / output[2].toFloat()
        }
        return exchangeRate
    }
}