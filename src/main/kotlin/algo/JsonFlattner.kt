package algo//
//fun algo.main(args: Array<String>) {
//    println("Mr Wil Json Flattener!")
//
//    val testCase = JSONObject(
//        """
//             {
//                 "automobile":{
//                     "gas":{
//                         "brand":"mercedes",
//                         "year":"2022"
//                     },
//                     "diesel":{
//                         "brand":"audi",
//                         "year":"2022"
//                     },
//                     "electric":{
//                         "brand":"tesla",
//                         "year":"2022"
//                     }
//                 },
//                 "bicycle":"pegas",
//                 "bldes":{
//                    "inline":{
//                        "for speed":{
//                            "brand":"Rollerblades"
//                        }
//                    }
//                }
//            }
//        """
//    )
//    val testCaseWithList = JSONObject(
//        """
//            {
//                "id": 2,
//                "name": "Ervin Howell",
//                "username": "Antonette",
//                "email": "Shanna@melissa.tv",
//                "address": {
//                    "street": "Victor Plains",
//                    "suite": "Suite 879",
//                    "city": "Wisokyburgh",
//                    "zipcode": "90566-7771",
//                    "geo": {
//                        "lat": "-43.9509",
//                        "lng": "-34.4618"
//                    }
//                },
//                "phone": "010-692-6593 x09125",
//                "website": "anastasia.net",
//                "company": {
//                    "name": "Deckow-Crist",
//                    "catchPhrase": "Proactive didactic contingency",
//                    "bs": "synergize scalable supply-chains"
//                },
//                "list": [
//                    {
//                        "userId": 1,
//                        "id": 1,
//                        "title": "Mr Wil",
//                        "body": "Wilson Ahanmisi"
//                    },
//                    {
//                        "userId": 1,
//                        "id": 2,
//                        "title": "Json Flatten",
//                        "body": "That was fun"
//                    }
//                ]
//                }
//        """.trimIndent()
//    )
//
//
//    println("${flattenItem(testCase)}")
//
//}
//
//
//fun flattenItem(
//    jsonObject: JSONObject,
//    flattenKey: String = "",
//    jsonMap: MutableMap<String, String> = mutableMapOf()
//): MutableMap<String, String> {
//    val map = jsonObject.toMap()
//
//    for ((key, value) in map.entries) {
//        val newKey = key.replace(" ", "--")
//        val updatedKey = if (flattenKey.isEmpty()) newKey else "${flattenKey}_${newKey}"
//
//        when (value) {
//            is HashMap<*, *> -> {
//                val wrappedMap = JSONObject.wrap(value)
//                flattenItem(wrappedMap as JSONObject, updatedKey, jsonMap)
//            }
//            is List<*> -> {
//                repeat(value.count()) {
//                    val wrappedList = JSONObject.wrap(value[it])
//                    flattenItem(wrappedList as JSONObject, updatedKey, jsonMap)
//                }
//            }
//            else -> {
//                jsonMap[updatedKey] = value.toString()
//                println("${updatedKey}=>${value}")
//            }
//        }
//    }
//    return jsonMap
//}
