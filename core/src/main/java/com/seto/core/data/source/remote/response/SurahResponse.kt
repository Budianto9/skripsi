package com.seto.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class SurahResponse(

	@field:SerializedName("name_translations")
	val nameTranslations: NameTranslations? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("number_of_ayah")
	val numberOfAyah: Int? = null,

	@field:SerializedName("place")
	val place: String? = null,

	@field:SerializedName("number_of_surah")
	val numberOfSurah: Int? = null,

	@field:SerializedName("recitation")
	val recitation: String? = null,

	@field:SerializedName("type")
	val type: String? = null
)

data class NameTranslations(

	@field:SerializedName("ar")
	val ar: String? = null,

	@field:SerializedName("en")
	val en: String? = null,

	@field:SerializedName("id")
	val id: String? = null
)
