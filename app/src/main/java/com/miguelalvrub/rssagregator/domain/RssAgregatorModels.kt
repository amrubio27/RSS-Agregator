package com.miguelalvrub.rssagregator.domain

//creo el modelo de datos del RSS
data class RssItems (val title: String, val description: String, val link:String, val contentLink: String, val thumbnailLink: String, val fechaNoticia: String)