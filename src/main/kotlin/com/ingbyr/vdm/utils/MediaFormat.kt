package com.ingbyr.vdm.utils

data class MediaFormat(
        val title: String,
        val desc: String,
        val vdmTaskID: Int,
        val formatID: String,
        val format: String,
        val formatNote: String,
        val fileSize: Long,
        val ext: String)