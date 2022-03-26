package com.seto.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class DetailSurahResponse(

	@field:SerializedName("name_translations")
	val nameTranslations: NameTranslations? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("recitations")
	val recitations: List<RecitationsItem?>? = null,

	@field:SerializedName("number_of_ayah")
	val numberOfAyah: Int? = null,

	@field:SerializedName("tafsir")
	val tafsir: Tafsir? = null,

	@field:SerializedName("place")
	val place: String? = null,

	@field:SerializedName("number_of_surah")
	val numberOfSurah: Int? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("verses")
	val verses: List<VersesItem?>? = null
)

data class VersesItem(

	@field:SerializedName("number")
	val number: Int? = null,

	@field:SerializedName("translation_id")
	val translationId: String? = null,

	@field:SerializedName("text")
	val text: String? = null,

	@field:SerializedName("translation_en")
	val translationEn: String? = null
)

data class RecitationsItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("audio_url")
	val audioUrl: String? = null
)

//data class NameTranslations(
//
//	@field:SerializedName("ar")
//	val ar: String? = null,
//
//	@field:SerializedName("en")
//	val en: String? = null,
//
//	@field:SerializedName("id")
//	val id: String? = null
//)

data class Text(

	@field:SerializedName("230")
	val jsonMember230: String? = null,

	@field:SerializedName("110")
	val jsonMember110: String? = null,

	@field:SerializedName("231")
	val jsonMember231: String? = null,

	@field:SerializedName("111")
	val jsonMember111: String? = null,

	@field:SerializedName("232")
	val jsonMember232: String? = null,

	@field:SerializedName("112")
	val jsonMember112: String? = null,

	@field:SerializedName("233")
	val jsonMember233: String? = null,

	@field:SerializedName("113")
	val jsonMember113: String? = null,

	@field:SerializedName("234")
	val jsonMember234: String? = null,

	@field:SerializedName("114")
	val jsonMember114: String? = null,

	@field:SerializedName("235")
	val jsonMember235: String? = null,

	@field:SerializedName("115")
	val jsonMember115: String? = null,

	@field:SerializedName("236")
	val jsonMember236: String? = null,

	@field:SerializedName("116")
	val jsonMember116: String? = null,

	@field:SerializedName("237")
	val jsonMember237: String? = null,

	@field:SerializedName("117")
	val jsonMember117: String? = null,

	@field:SerializedName("238")
	val jsonMember238: String? = null,

	@field:SerializedName("118")
	val jsonMember118: String? = null,

	@field:SerializedName("239")
	val jsonMember239: String? = null,

	@field:SerializedName("119")
	val jsonMember119: String? = null,

	@field:SerializedName("10")
	val jsonMember10: String? = null,

	@field:SerializedName("11")
	val jsonMember11: String? = null,

	@field:SerializedName("12")
	val jsonMember12: String? = null,

	@field:SerializedName("13")
	val jsonMember13: String? = null,

	@field:SerializedName("14")
	val jsonMember14: String? = null,

	@field:SerializedName("15")
	val jsonMember15: String? = null,

	@field:SerializedName("16")
	val jsonMember16: String? = null,

	@field:SerializedName("17")
	val jsonMember17: String? = null,

	@field:SerializedName("18")
	val jsonMember18: String? = null,

	@field:SerializedName("19")
	val jsonMember19: String? = null,

	@field:SerializedName("240")
	val jsonMember240: String? = null,

	@field:SerializedName("120")
	val jsonMember120: String? = null,

	@field:SerializedName("241")
	val jsonMember241: String? = null,

	@field:SerializedName("121")
	val jsonMember121: String? = null,

	@field:SerializedName("242")
	val jsonMember242: String? = null,

	@field:SerializedName("1")
	val jsonMember1: String? = null,

	@field:SerializedName("122")
	val jsonMember122: String? = null,

	@field:SerializedName("243")
	val jsonMember243: String? = null,

	@field:SerializedName("2")
	val jsonMember2: String? = null,

	@field:SerializedName("123")
	val jsonMember123: String? = null,

	@field:SerializedName("244")
	val jsonMember244: String? = null,

	@field:SerializedName("3")
	val jsonMember3: String? = null,

	@field:SerializedName("124")
	val jsonMember124: String? = null,

	@field:SerializedName("245")
	val jsonMember245: String? = null,

	@field:SerializedName("4")
	val jsonMember4: String? = null,

	@field:SerializedName("125")
	val jsonMember125: String? = null,

	@field:SerializedName("246")
	val jsonMember246: String? = null,

	@field:SerializedName("5")
	val jsonMember5: String? = null,

	@field:SerializedName("126")
	val jsonMember126: String? = null,

	@field:SerializedName("247")
	val jsonMember247: String? = null,

	@field:SerializedName("6")
	val jsonMember6: String? = null,

	@field:SerializedName("127")
	val jsonMember127: String? = null,

	@field:SerializedName("248")
	val jsonMember248: String? = null,

	@field:SerializedName("7")
	val jsonMember7: String? = null,

	@field:SerializedName("128")
	val jsonMember128: String? = null,

	@field:SerializedName("249")
	val jsonMember249: String? = null,

	@field:SerializedName("8")
	val jsonMember8: String? = null,

	@field:SerializedName("129")
	val jsonMember129: String? = null,

	@field:SerializedName("9")
	val jsonMember9: String? = null,

	@field:SerializedName("20")
	val jsonMember20: String? = null,

	@field:SerializedName("21")
	val jsonMember21: String? = null,

	@field:SerializedName("22")
	val jsonMember22: String? = null,

	@field:SerializedName("23")
	val jsonMember23: String? = null,

	@field:SerializedName("24")
	val jsonMember24: String? = null,

	@field:SerializedName("25")
	val jsonMember25: String? = null,

	@field:SerializedName("26")
	val jsonMember26: String? = null,

	@field:SerializedName("27")
	val jsonMember27: String? = null,

	@field:SerializedName("28")
	val jsonMember28: String? = null,

	@field:SerializedName("29")
	val jsonMember29: String? = null,

	@field:SerializedName("250")
	val jsonMember250: String? = null,

	@field:SerializedName("130")
	val jsonMember130: String? = null,

	@field:SerializedName("251")
	val jsonMember251: String? = null,

	@field:SerializedName("131")
	val jsonMember131: String? = null,

	@field:SerializedName("252")
	val jsonMember252: String? = null,

	@field:SerializedName("132")
	val jsonMember132: String? = null,

	@field:SerializedName("253")
	val jsonMember253: String? = null,

	@field:SerializedName("133")
	val jsonMember133: String? = null,

	@field:SerializedName("254")
	val jsonMember254: String? = null,

	@field:SerializedName("134")
	val jsonMember134: String? = null,

	@field:SerializedName("255")
	val jsonMember255: String? = null,

	@field:SerializedName("135")
	val jsonMember135: String? = null,

	@field:SerializedName("256")
	val jsonMember256: String? = null,

	@field:SerializedName("136")
	val jsonMember136: String? = null,

	@field:SerializedName("257")
	val jsonMember257: String? = null,

	@field:SerializedName("137")
	val jsonMember137: String? = null,

	@field:SerializedName("258")
	val jsonMember258: String? = null,

	@field:SerializedName("138")
	val jsonMember138: String? = null,

	@field:SerializedName("259")
	val jsonMember259: String? = null,

	@field:SerializedName("139")
	val jsonMember139: String? = null,

	@field:SerializedName("30")
	val jsonMember30: String? = null,

	@field:SerializedName("31")
	val jsonMember31: String? = null,

	@field:SerializedName("32")
	val jsonMember32: String? = null,

	@field:SerializedName("33")
	val jsonMember33: String? = null,

	@field:SerializedName("34")
	val jsonMember34: String? = null,

	@field:SerializedName("35")
	val jsonMember35: String? = null,

	@field:SerializedName("36")
	val jsonMember36: String? = null,

	@field:SerializedName("37")
	val jsonMember37: String? = null,

	@field:SerializedName("38")
	val jsonMember38: String? = null,

	@field:SerializedName("39")
	val jsonMember39: String? = null,

	@field:SerializedName("260")
	val jsonMember260: String? = null,

	@field:SerializedName("140")
	val jsonMember140: String? = null,

	@field:SerializedName("261")
	val jsonMember261: String? = null,

	@field:SerializedName("141")
	val jsonMember141: String? = null,

	@field:SerializedName("262")
	val jsonMember262: String? = null,

	@field:SerializedName("142")
	val jsonMember142: String? = null,

	@field:SerializedName("263")
	val jsonMember263: String? = null,

	@field:SerializedName("143")
	val jsonMember143: String? = null,

	@field:SerializedName("264")
	val jsonMember264: String? = null,

	@field:SerializedName("144")
	val jsonMember144: String? = null,

	@field:SerializedName("265")
	val jsonMember265: String? = null,

	@field:SerializedName("145")
	val jsonMember145: String? = null,

	@field:SerializedName("266")
	val jsonMember266: String? = null,

	@field:SerializedName("146")
	val jsonMember146: String? = null,

	@field:SerializedName("267")
	val jsonMember267: String? = null,

	@field:SerializedName("147")
	val jsonMember147: String? = null,

	@field:SerializedName("268")
	val jsonMember268: String? = null,

	@field:SerializedName("148")
	val jsonMember148: String? = null,

	@field:SerializedName("269")
	val jsonMember269: String? = null,

	@field:SerializedName("149")
	val jsonMember149: String? = null,

	@field:SerializedName("40")
	val jsonMember40: String? = null,

	@field:SerializedName("41")
	val jsonMember41: String? = null,

	@field:SerializedName("42")
	val jsonMember42: String? = null,

	@field:SerializedName("43")
	val jsonMember43: String? = null,

	@field:SerializedName("44")
	val jsonMember44: String? = null,

	@field:SerializedName("45")
	val jsonMember45: String? = null,

	@field:SerializedName("46")
	val jsonMember46: String? = null,

	@field:SerializedName("47")
	val jsonMember47: String? = null,

	@field:SerializedName("48")
	val jsonMember48: String? = null,

	@field:SerializedName("49")
	val jsonMember49: String? = null,

	@field:SerializedName("270")
	val jsonMember270: String? = null,

	@field:SerializedName("150")
	val jsonMember150: String? = null,

	@field:SerializedName("271")
	val jsonMember271: String? = null,

	@field:SerializedName("151")
	val jsonMember151: String? = null,

	@field:SerializedName("272")
	val jsonMember272: String? = null,

	@field:SerializedName("152")
	val jsonMember152: String? = null,

	@field:SerializedName("273")
	val jsonMember273: String? = null,

	@field:SerializedName("153")
	val jsonMember153: String? = null,

	@field:SerializedName("274")
	val jsonMember274: String? = null,

	@field:SerializedName("154")
	val jsonMember154: String? = null,

	@field:SerializedName("275")
	val jsonMember275: String? = null,

	@field:SerializedName("155")
	val jsonMember155: String? = null,

	@field:SerializedName("276")
	val jsonMember276: String? = null,

	@field:SerializedName("156")
	val jsonMember156: String? = null,

	@field:SerializedName("277")
	val jsonMember277: String? = null,

	@field:SerializedName("157")
	val jsonMember157: String? = null,

	@field:SerializedName("278")
	val jsonMember278: String? = null,

	@field:SerializedName("158")
	val jsonMember158: String? = null,

	@field:SerializedName("279")
	val jsonMember279: String? = null,

	@field:SerializedName("159")
	val jsonMember159: String? = null,

	@field:SerializedName("50")
	val jsonMember50: String? = null,

	@field:SerializedName("51")
	val jsonMember51: String? = null,

	@field:SerializedName("52")
	val jsonMember52: String? = null,

	@field:SerializedName("53")
	val jsonMember53: String? = null,

	@field:SerializedName("54")
	val jsonMember54: String? = null,

	@field:SerializedName("55")
	val jsonMember55: String? = null,

	@field:SerializedName("56")
	val jsonMember56: String? = null,

	@field:SerializedName("57")
	val jsonMember57: String? = null,

	@field:SerializedName("58")
	val jsonMember58: String? = null,

	@field:SerializedName("59")
	val jsonMember59: String? = null,

	@field:SerializedName("280")
	val jsonMember280: String? = null,

	@field:SerializedName("160")
	val jsonMember160: String? = null,

	@field:SerializedName("281")
	val jsonMember281: String? = null,

	@field:SerializedName("161")
	val jsonMember161: String? = null,

	@field:SerializedName("282")
	val jsonMember282: String? = null,

	@field:SerializedName("162")
	val jsonMember162: String? = null,

	@field:SerializedName("283")
	val jsonMember283: String? = null,

	@field:SerializedName("163")
	val jsonMember163: String? = null,

	@field:SerializedName("284")
	val jsonMember284: String? = null,

	@field:SerializedName("164")
	val jsonMember164: String? = null,

	@field:SerializedName("285")
	val jsonMember285: String? = null,

	@field:SerializedName("165")
	val jsonMember165: String? = null,

	@field:SerializedName("286")
	val jsonMember286: String? = null,

	@field:SerializedName("166")
	val jsonMember166: String? = null,

	@field:SerializedName("167")
	val jsonMember167: String? = null,

	@field:SerializedName("168")
	val jsonMember168: String? = null,

	@field:SerializedName("169")
	val jsonMember169: String? = null,

	@field:SerializedName("60")
	val jsonMember60: String? = null,

	@field:SerializedName("61")
	val jsonMember61: String? = null,

	@field:SerializedName("62")
	val jsonMember62: String? = null,

	@field:SerializedName("63")
	val jsonMember63: String? = null,

	@field:SerializedName("64")
	val jsonMember64: String? = null,

	@field:SerializedName("65")
	val jsonMember65: String? = null,

	@field:SerializedName("66")
	val jsonMember66: String? = null,

	@field:SerializedName("67")
	val jsonMember67: String? = null,

	@field:SerializedName("68")
	val jsonMember68: String? = null,

	@field:SerializedName("69")
	val jsonMember69: String? = null,

	@field:SerializedName("170")
	val jsonMember170: String? = null,

	@field:SerializedName("171")
	val jsonMember171: String? = null,

	@field:SerializedName("172")
	val jsonMember172: String? = null,

	@field:SerializedName("173")
	val jsonMember173: String? = null,

	@field:SerializedName("174")
	val jsonMember174: String? = null,

	@field:SerializedName("175")
	val jsonMember175: String? = null,

	@field:SerializedName("176")
	val jsonMember176: String? = null,

	@field:SerializedName("177")
	val jsonMember177: String? = null,

	@field:SerializedName("178")
	val jsonMember178: String? = null,

	@field:SerializedName("179")
	val jsonMember179: String? = null,

	@field:SerializedName("70")
	val jsonMember70: String? = null,

	@field:SerializedName("71")
	val jsonMember71: String? = null,

	@field:SerializedName("72")
	val jsonMember72: String? = null,

	@field:SerializedName("73")
	val jsonMember73: String? = null,

	@field:SerializedName("74")
	val jsonMember74: String? = null,

	@field:SerializedName("75")
	val jsonMember75: String? = null,

	@field:SerializedName("76")
	val jsonMember76: String? = null,

	@field:SerializedName("77")
	val jsonMember77: String? = null,

	@field:SerializedName("78")
	val jsonMember78: String? = null,

	@field:SerializedName("79")
	val jsonMember79: String? = null,

	@field:SerializedName("180")
	val jsonMember180: String? = null,

	@field:SerializedName("181")
	val jsonMember181: String? = null,

	@field:SerializedName("182")
	val jsonMember182: String? = null,

	@field:SerializedName("183")
	val jsonMember183: String? = null,

	@field:SerializedName("184")
	val jsonMember184: String? = null,

	@field:SerializedName("185")
	val jsonMember185: String? = null,

	@field:SerializedName("186")
	val jsonMember186: String? = null,

	@field:SerializedName("187")
	val jsonMember187: String? = null,

	@field:SerializedName("188")
	val jsonMember188: String? = null,

	@field:SerializedName("189")
	val jsonMember189: String? = null,

	@field:SerializedName("80")
	val jsonMember80: String? = null,

	@field:SerializedName("81")
	val jsonMember81: String? = null,

	@field:SerializedName("82")
	val jsonMember82: String? = null,

	@field:SerializedName("83")
	val jsonMember83: String? = null,

	@field:SerializedName("84")
	val jsonMember84: String? = null,

	@field:SerializedName("85")
	val jsonMember85: String? = null,

	@field:SerializedName("86")
	val jsonMember86: String? = null,

	@field:SerializedName("87")
	val jsonMember87: String? = null,

	@field:SerializedName("88")
	val jsonMember88: String? = null,

	@field:SerializedName("89")
	val jsonMember89: String? = null,

	@field:SerializedName("190")
	val jsonMember190: String? = null,

	@field:SerializedName("191")
	val jsonMember191: String? = null,

	@field:SerializedName("192")
	val jsonMember192: String? = null,

	@field:SerializedName("193")
	val jsonMember193: String? = null,

	@field:SerializedName("194")
	val jsonMember194: String? = null,

	@field:SerializedName("195")
	val jsonMember195: String? = null,

	@field:SerializedName("196")
	val jsonMember196: String? = null,

	@field:SerializedName("197")
	val jsonMember197: String? = null,

	@field:SerializedName("198")
	val jsonMember198: String? = null,

	@field:SerializedName("199")
	val jsonMember199: String? = null,

	@field:SerializedName("90")
	val jsonMember90: String? = null,

	@field:SerializedName("91")
	val jsonMember91: String? = null,

	@field:SerializedName("92")
	val jsonMember92: String? = null,

	@field:SerializedName("93")
	val jsonMember93: String? = null,

	@field:SerializedName("94")
	val jsonMember94: String? = null,

	@field:SerializedName("95")
	val jsonMember95: String? = null,

	@field:SerializedName("96")
	val jsonMember96: String? = null,

	@field:SerializedName("97")
	val jsonMember97: String? = null,

	@field:SerializedName("98")
	val jsonMember98: String? = null,

	@field:SerializedName("99")
	val jsonMember99: String? = null,

	@field:SerializedName("200")
	val jsonMember200: String? = null,

	@field:SerializedName("201")
	val jsonMember201: String? = null,

	@field:SerializedName("202")
	val jsonMember202: String? = null,

	@field:SerializedName("203")
	val jsonMember203: String? = null,

	@field:SerializedName("204")
	val jsonMember204: String? = null,

	@field:SerializedName("205")
	val jsonMember205: String? = null,

	@field:SerializedName("206")
	val jsonMember206: String? = null,

	@field:SerializedName("207")
	val jsonMember207: String? = null,

	@field:SerializedName("208")
	val jsonMember208: String? = null,

	@field:SerializedName("209")
	val jsonMember209: String? = null,

	@field:SerializedName("210")
	val jsonMember210: String? = null,

	@field:SerializedName("211")
	val jsonMember211: String? = null,

	@field:SerializedName("212")
	val jsonMember212: String? = null,

	@field:SerializedName("213")
	val jsonMember213: String? = null,

	@field:SerializedName("214")
	val jsonMember214: String? = null,

	@field:SerializedName("215")
	val jsonMember215: String? = null,

	@field:SerializedName("216")
	val jsonMember216: String? = null,

	@field:SerializedName("217")
	val jsonMember217: String? = null,

	@field:SerializedName("218")
	val jsonMember218: String? = null,

	@field:SerializedName("219")
	val jsonMember219: String? = null,

	@field:SerializedName("220")
	val jsonMember220: String? = null,

	@field:SerializedName("100")
	val jsonMember100: String? = null,

	@field:SerializedName("221")
	val jsonMember221: String? = null,

	@field:SerializedName("101")
	val jsonMember101: String? = null,

	@field:SerializedName("222")
	val jsonMember222: String? = null,

	@field:SerializedName("102")
	val jsonMember102: String? = null,

	@field:SerializedName("223")
	val jsonMember223: String? = null,

	@field:SerializedName("103")
	val jsonMember103: String? = null,

	@field:SerializedName("224")
	val jsonMember224: String? = null,

	@field:SerializedName("104")
	val jsonMember104: String? = null,

	@field:SerializedName("225")
	val jsonMember225: String? = null,

	@field:SerializedName("105")
	val jsonMember105: String? = null,

	@field:SerializedName("226")
	val jsonMember226: String? = null,

	@field:SerializedName("106")
	val jsonMember106: String? = null,

	@field:SerializedName("227")
	val jsonMember227: String? = null,

	@field:SerializedName("107")
	val jsonMember107: String? = null,

	@field:SerializedName("228")
	val jsonMember228: String? = null,

	@field:SerializedName("108")
	val jsonMember108: String? = null,

	@field:SerializedName("229")
	val jsonMember229: String? = null,

	@field:SerializedName("109")
	val jsonMember109: String? = null
)

data class Id(

	@field:SerializedName("kemenag")
	val kemenag: Kemenag? = null
)

data class Kemenag(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("source")
	val source: String? = null,

	@field:SerializedName("text")
	val text: Text? = null
)

data class Tafsir(

	@field:SerializedName("id")
	val id: Id? = null
)
