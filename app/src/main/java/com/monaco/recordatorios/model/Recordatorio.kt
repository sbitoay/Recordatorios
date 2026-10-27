package com.monaco.recordatorios.model

import androidx.compose.ui.graphics.Color

enum class Prioridad {
    ALTA, MEDIA, BAJA
}

enum class Categoria(val nombre: String, val color: Color) {
    TRABAJO("Trabajo", Color(0xFFE57373)),
    PERSONAL("Personal", Color(0xFF81C784)),
    ESTUDIO("Estudio", Color(0xFF64B5F6)),
    SALUD("Salud", Color(0xFFFFB74D))
}

sealed class EstadoApp {
    object Cargando : EstadoApp()
    data class ConDatos(val recordatorios: List<Recordatorio>) : EstadoApp()
    data class Error(val mensaje: String) : EstadoApp()
}

data class Recordatorio(
    val id: Long,
    val titulo: String,
    val descripcion: String? = null,
    val prioridad: Prioridad,
    val categoria: Categoria,
    val completado: Boolean = false,
    val ubicacion: String? = null
)