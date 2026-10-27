package com.monaco.recordatorios.data

import androidx.compose.ui.graphics.Color
import com.monaco.recordatorios.model.Categoria
import com.monaco.recordatorios.model.Prioridad
import com.monaco.recordatorios.model.Recordatorio

object DatosSimulados {

    val listaRecordatorios = listOf(
        Recordatorio(
            id = 1L,
            titulo = "Entregar Actividad 1 de Mobile",
            descripcion = "Subir informe PDF y repositorio",
            prioridad = Prioridad.ALTA,
            categoria = Categoria.ESTUDIO,
            completado = false,
            ubicacion = "Plataforma Educativa"
        ),
        Recordatorio(
            id = 2L,
            titulo = "Comprar insumos de oficina",
            descripcion = null,
            prioridad = Prioridad.MEDIA,
            categoria = Categoria.TRABAJO,
            completado = false
        ),
        Recordatorio(
            id = 3L,
            titulo = "Turno médico anual",
            descripcion = "Llevar estudios previos",
            prioridad = Prioridad.ALTA,
            categoria = Categoria.SALUD,
            completado = true,
            ubicacion = "Centro Médico"
        ),
        Recordatorio(
            id = 4L,
            titulo = "Planificar rutina de entrenamiento",
            prioridad = Prioridad.BAJA,
            categoria = Categoria.PERSONAL,
            completado = false
        )
    )

    val categoriasUnicas: Set<Categoria> = listaRecordatorios.map { it.categoria }.toSet()

    val mapaColoresCategoria: Map<Categoria, Color> = Categoria.values().associateWith { it.color }

    fun obtenerPendientes(): List<Recordatorio> {
        return listaRecordatorios.filter { !it.completado }
    }

    fun obtenerPorPrioridad(prioridad: Prioridad): List<Recordatorio> {
        return listaRecordatorios.filter { it.prioridad == prioridad }
    }
}