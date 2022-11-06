package com.example.listaparques

class ParqueProvider {
    companion object {
        val ListaParques = listOf<Parque>(
            Parque(
                nombre = "Parque del Retiro",
                descripcion = "Parque historico y de recreo en Madrid",
                enlaceImagen = "https://media.timeout.com/images/105835727/750/422/image.jpg"
            ),

            Parque(
                nombre = "Parque de María Luisa",
                descripcion = "Parque junto a la Plaza de España con gran cantidad de aves, plantas y zonas de juego en Sevilla",
                enlaceImagen = "https://www.tegustaviajar.com/wp-content/uploads/2019/08/parque-de-maria-luisa.jpg"
            ),

            Parque(
                nombre = "Parque Güell",
                descripcion = "Parque público con jardines y elementos arquitectónicos en Barcelona",
                enlaceImagen = "https://thebettervacation.com/wp-content/uploads/2021/06/Park-Guell-1200x900.jpg"
            ),

            Parque(
                nombre = "Parque Federico García Lorca",
                descripcion = "Parque dedicado al poeta Federico García Lorca en la capital de su provincia natal, Granada",
                enlaceImagen = "https://d1bvpoagx8hqbg.cloudfront.net/originals/parque-federico-garcia-lorca-55ff6e5fb3d4e67b9caae3309160083b.jpg"
            ),

            Parque(
                nombre = "Jardines de la Agricultura",
                descripcion = "Conocido popularmente como \"Los Patos\", se encuentra entre las avenidas de América, Cervantes y de los Mozárabes",
                enlaceImagen = "https://upload.wikimedia.org/wikipedia/commons/f/f1/Jardines_de_la_Agricultura.jpg"
            ),
        )
    }
}