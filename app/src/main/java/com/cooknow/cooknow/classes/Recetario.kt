package com.cooknow.cooknow.classes

import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.cooknow.cooknow.R

class Recetario(

    private val recetario: MutableList<Receta> = mutableListOf(
        Receta(id = 1,
               nombre = "Canelones Navideños",
               imagen = R.drawable.canelones,
               descripcion = "Hay básicos navideños que nunca pueden faltar en la mesa. Los canelones caseros son una de estas recetas. Mis preferidos en el mundo son los que hacen mis abuelas el día de Sant Esteve, con las sobras de la carn d’olla del día de Navidad. Sin esos canelones para mi no hay Navidad.",
               duracion = "24h",
               raciones = "30-40",
               dificultad = 1,
               ingredientes = mutableListOf(
                   "500 gr cabeza de lomo (en pieza entera) o pollo",
                   "1 cebolla grande",
                   "30-40 placas de pasta para canelones",
                   "Para la bechamel: 4 cdas colmadas mantequilla + 4 cdas colmadas harina + 3 y 1/2 vaso de leche + Sal + Nuez moscada",
                   "Queso para gratinar"
               ),
               pasos = mutableListOf(
                   Pasos(id = 1,
                         contenido = "Si optáis por hacer los canelones de carne maceada deberéis empezar unas 24h antes a prepararlos. Para ello empezaremos por el marinado. En un bol mezclaremos la mostaza, el ajo picado fino, el pimentón, la sal, la pimienta, el orégano, el jengibre, la miel y el aceite de oliva y haremos como una especie de pasta. Con ella embadurnaremos toda la pieza de carne, masajeándola bien. Luego añadiremos el zumo de la naranja y volveremos a masajear la carne y que se impregne bien. \n" +
                                 "\n" +
                                 "Luego pondremos la pieza en una bandeja o fuente y verteremos dentro la cerveza hasta cubrir la pieza. Taparemos con film y nos lo llevaremos a la nevera un mínimo de 12h, pero si está 24h mejor que mejor. Durante este tiempo os recomiendo ir dándole la vuelta a la pieza un par o tres de veces."
                   ),
                   Pasos(id = 2,
                         contenido = "Pasado el tiempo de reposo de la carne, será tiempo de cocinarla. La pondremos en una olla o cazuela y verteremos dentro todo el litro de caldo y el jugo del marinado colado. Taparemos la olla o cazuela. Llevaremos a ebullición y cuando empiece a hervir bajaremos el fuego al mínimo y cocinaremos durante 3 o 4 horas o hasta que veamos que la pieza está bien tierna. Si veis que se consume mucho el líquido podéis añadirle un pelín de agua. Este proceso también se puede hacer al horno, a 80ºC, también 3-4 horas.\n" +
                                 "\n" +
                                 "Una vez cocinada la pasaremos a un plato grande y con la ayuda de dos tenedores o las manos deshilaremos la pieza entera.\n" +
                                 "\n" +
                                 "Lo que sobre del caldo, lo pasaremos a un cazo y lo cocinaremos tapado, a fuego bajo, hasta que reduzca y se convierta en una salsa algo densa."
                   ),
                   Pasos(id = 3,
                         contenido = "Cuando ya tenemos la carne deshilada y la salsa hecha, ya podemos empezar el montaje de estos canelones. Prepararemos el sofrito. Para ello picaremos fina la cebolla y la pocharemos en una sartén. Cuando esté bien cocinada, añadiremos la carne y lo mezclaremos bien. Luego agregaremos 5 o 6 cdas de la salsa y lo integraremos todo muy bien. Reservaremos."
                   ),
                   Pasos(id = 4,
                         contenido = "Pondremos una olla a hervir y cocinaremos las placas de canelones según las instrucciones del paquete. Os recomiendo poner un poco de bicarbonato para que no se peguen entre ellas."
                   ),
                   Pasos(id = 5,
                         contenido = "Mientras se cocinan las placas prepararemos la bechamel. Para ello pondremos la mantequilla en un cazo u olla. Cuando se derrita, agregaremos la harina y removeremos constantemente unos minutos hasta que la harina se dore y se cocine un poco. Entonces agregaremos la leche, previamente calentada en el microondas, y no dejaremos de remover hasta que empiece a densificar. Cuando tengamos la textura deseada, añadiremos la sal y nuez moscada al gusto."
                   ),
                   Pasos(id = 6,
                         contenido = "Pondremos unas cucharadas de bechamel en el relleno, para que quede un poco más pastoso y sea más fácil de rellenar los canelones. También para darle sabor y jugosidad. Luego pondremos una capa fina de bechamel en la base de la fuente/s en la/s que serviremos los canelones. "
                   ),
                   Pasos(id = 7,
                         contenido = "Rellenaremos las placas de canelones y enrollaremos. Iremos poniendo los canelones rellenos en la fuente con la bechamel, y los colocaremos bastante juntos. Seguiremos hasta acabar con todo el relleno. Luego verteremos el resto de bechamel que teníamos reservada por encima, hasta cubrir todos los canelones. "
                   ),
                   Pasos(id = 8,
                         contenido = "Cubriremos con queso. A mi me gusta poner mozzarella para que se derrita y otro queso tipo filato para dar un poco de crujiente. Lo llevaremos al horno, pre-calentado a 180ºC. Cocinaremos unos 10 min y luego lo pondremos en modo gratinar hasta que se doren."
                   )
               ),
               congrats = "¡Listo! Parece laborioso, pero en realidad el macerado y cocinado de la carne se hace solo y los sofritos de ambos tipos de canelones son muy sencillos.",
               done = true
            ),
        Receta(id = 2,
            nombre = "Quiche de Tomates",
            imagen = R.drawable.quiche_tomates,
            descripcion = "En casa nos encanta prepararlas, porque realmente se pueden hacer de cualquier cosa y son una comida o acompañamiento geniales. Son un plato muy versátil: combinan genial con cualquier verdura, pero también frutas o embutidos. ",
            duracion = "60-70 min",
            raciones = "1 quiche",
            dificultad = 1,
            ingredientes = mutableListOf(
                "500 gr cabeza de lomo (en pieza entera) o pollo",
                "1 cebolla grande",
                "30-40 placas de pasta para canelones",
                "Para la bechamel: 4 cdas colmadas mantequilla + 4 cdas colmadas harina + 3 y 1/2 vaso de leche + Sal + Nuez moscada",
                "Queso para gratinar"
            ),
            pasos = mutableListOf(
                Pasos(id = 1,
                    contenido = "Si optáis por hacer los canelones de carne maceada deberéis empezar unas 24h antes a prepararlos. Para ello empezaremos por el marinado. En un bol mezclaremos la mostaza, el ajo picado fino, el pimentón, la sal, la pimienta, el orégano, el jengibre, la miel y el aceite de oliva y haremos como una especie de pasta. Con ella embadurnaremos toda la pieza de carne, masajeándola bien. Luego añadiremos el zumo de la naranja y volveremos a masajear la carne y que se impregne bien. \n" +
                            "\n" +
                            "Luego pondremos la pieza en una bandeja o fuente y verteremos dentro la cerveza hasta cubrir la pieza. Taparemos con film y nos lo llevaremos a la nevera un mínimo de 12h, pero si está 24h mejor que mejor. Durante este tiempo os recomiendo ir dándole la vuelta a la pieza un par o tres de veces."
                ),
                Pasos(id = 2,
                    contenido = "Pasado el tiempo de reposo de la carne, será tiempo de cocinarla. La pondremos en una olla o cazuela y verteremos dentro todo el litro de caldo y el jugo del marinado colado. Taparemos la olla o cazuela. Llevaremos a ebullición y cuando empiece a hervir bajaremos el fuego al mínimo y cocinaremos durante 3 o 4 horas o hasta que veamos que la pieza está bien tierna. Si veis que se consume mucho el líquido podéis añadirle un pelín de agua. Este proceso también se puede hacer al horno, a 80ºC, también 3-4 horas.\n" +
                            "\n" +
                            "Una vez cocinada la pasaremos a un plato grande y con la ayuda de dos tenedores o las manos deshilaremos la pieza entera.\n" +
                            "\n" +
                            "Lo que sobre del caldo, lo pasaremos a un cazo y lo cocinaremos tapado, a fuego bajo, hasta que reduzca y se convierta en una salsa algo densa."
                ),
                Pasos(id = 3,
                    contenido = "Cuando ya tenemos la carne deshilada y la salsa hecha, ya podemos empezar el montaje de estos canelones. Prepararemos el sofrito. Para ello picaremos fina la cebolla y la pocharemos en una sartén. Cuando esté bien cocinada, añadiremos la carne y lo mezclaremos bien. Luego agregaremos 5 o 6 cdas de la salsa y lo integraremos todo muy bien. Reservaremos."
                ),
                Pasos(id = 4,
                    contenido = "Pondremos una olla a hervir y cocinaremos las placas de canelones según las instrucciones del paquete. Os recomiendo poner un poco de bicarbonato para que no se peguen entre ellas."
                ),
                Pasos(id = 5,
                    contenido = "Mientras se cocinan las placas prepararemos la bechamel. Para ello pondremos la mantequilla en un cazo u olla. Cuando se derrita, agregaremos la harina y removeremos constantemente unos minutos hasta que la harina se dore y se cocine un poco. Entonces agregaremos la leche, previamente calentada en el microondas, y no dejaremos de remover hasta que empiece a densificar. Cuando tengamos la textura deseada, añadiremos la sal y nuez moscada al gusto."
                ),
                Pasos(id = 6,
                    contenido = "Pondremos unas cucharadas de bechamel en el relleno, para que quede un poco más pastoso y sea más fácil de rellenar los canelones. También para darle sabor y jugosidad. Luego pondremos una capa fina de bechamel en la base de la fuente/s en la/s que serviremos los canelones. "
                ),
                Pasos(id = 7,
                    contenido = "Rellenaremos las placas de canelones y enrollaremos. Iremos poniendo los canelones rellenos en la fuente con la bechamel, y los colocaremos bastante juntos. Seguiremos hasta acabar con todo el relleno. Luego verteremos el resto de bechamel que teníamos reservada por encima, hasta cubrir todos los canelones. "
                ),
                Pasos(id = 8,
                    contenido = "Cubriremos con queso. A mi me gusta poner mozzarella para que se derrita y otro queso tipo filato para dar un poco de crujiente. Lo llevaremos al horno, pre-calentado a 180ºC. Cocinaremos unos 10 min y luego lo pondremos en modo gratinar hasta que se doren."
                )
            ),
            congrats = "¡Listo! Parece laborioso, pero en realidad el macerado y cocinado de la carne se hace solo y los sofritos de ambos tipos de canelones son muy sencillos.",
            done = true
        ),
        Receta(id = 3,
            nombre = "Calamares Rellenos",
            imagen = R.drawable.calamares_rellenos,
            descripcion = "Es una receta sencilla, pero si que son algo entretenidos de preparar y, como os decía, mejor cocinarlos con calma para que queden exquisitos.",
            duracion = "70-80 min",
            raciones = "2 personas",
            dificultad = 2,
            ingredientes = mutableListOf(
                "500 gr cabeza de lomo (en pieza entera) o pollo",
                "1 cebolla grande",
                "30-40 placas de pasta para canelones",
                "Para la bechamel: 4 cdas colmadas mantequilla + 4 cdas colmadas harina + 3 y 1/2 vaso de leche + Sal + Nuez moscada",
                "Queso para gratinar"
            ),
            pasos = mutableListOf(
                Pasos(id = 1,
                    contenido = "Si optáis por hacer los canelones de carne maceada deberéis empezar unas 24h antes a prepararlos. Para ello empezaremos por el marinado. En un bol mezclaremos la mostaza, el ajo picado fino, el pimentón, la sal, la pimienta, el orégano, el jengibre, la miel y el aceite de oliva y haremos como una especie de pasta. Con ella embadurnaremos toda la pieza de carne, masajeándola bien. Luego añadiremos el zumo de la naranja y volveremos a masajear la carne y que se impregne bien. \n" +
                            "\n" +
                            "Luego pondremos la pieza en una bandeja o fuente y verteremos dentro la cerveza hasta cubrir la pieza. Taparemos con film y nos lo llevaremos a la nevera un mínimo de 12h, pero si está 24h mejor que mejor. Durante este tiempo os recomiendo ir dándole la vuelta a la pieza un par o tres de veces."
                ),
                Pasos(id = 2,
                    contenido = "Pasado el tiempo de reposo de la carne, será tiempo de cocinarla. La pondremos en una olla o cazuela y verteremos dentro todo el litro de caldo y el jugo del marinado colado. Taparemos la olla o cazuela. Llevaremos a ebullición y cuando empiece a hervir bajaremos el fuego al mínimo y cocinaremos durante 3 o 4 horas o hasta que veamos que la pieza está bien tierna. Si veis que se consume mucho el líquido podéis añadirle un pelín de agua. Este proceso también se puede hacer al horno, a 80ºC, también 3-4 horas.\n" +
                            "\n" +
                            "Una vez cocinada la pasaremos a un plato grande y con la ayuda de dos tenedores o las manos deshilaremos la pieza entera.\n" +
                            "\n" +
                            "Lo que sobre del caldo, lo pasaremos a un cazo y lo cocinaremos tapado, a fuego bajo, hasta que reduzca y se convierta en una salsa algo densa."
                ),
                Pasos(id = 3,
                    contenido = "Cuando ya tenemos la carne deshilada y la salsa hecha, ya podemos empezar el montaje de estos canelones. Prepararemos el sofrito. Para ello picaremos fina la cebolla y la pocharemos en una sartén. Cuando esté bien cocinada, añadiremos la carne y lo mezclaremos bien. Luego agregaremos 5 o 6 cdas de la salsa y lo integraremos todo muy bien. Reservaremos."
                ),
                Pasos(id = 4,
                    contenido = "Pondremos una olla a hervir y cocinaremos las placas de canelones según las instrucciones del paquete. Os recomiendo poner un poco de bicarbonato para que no se peguen entre ellas."
                ),
                Pasos(id = 5,
                    contenido = "Mientras se cocinan las placas prepararemos la bechamel. Para ello pondremos la mantequilla en un cazo u olla. Cuando se derrita, agregaremos la harina y removeremos constantemente unos minutos hasta que la harina se dore y se cocine un poco. Entonces agregaremos la leche, previamente calentada en el microondas, y no dejaremos de remover hasta que empiece a densificar. Cuando tengamos la textura deseada, añadiremos la sal y nuez moscada al gusto."
                ),
                Pasos(id = 6,
                    contenido = "Pondremos unas cucharadas de bechamel en el relleno, para que quede un poco más pastoso y sea más fácil de rellenar los canelones. También para darle sabor y jugosidad. Luego pondremos una capa fina de bechamel en la base de la fuente/s en la/s que serviremos los canelones. "
                ),
                Pasos(id = 7,
                    contenido = "Rellenaremos las placas de canelones y enrollaremos. Iremos poniendo los canelones rellenos en la fuente con la bechamel, y los colocaremos bastante juntos. Seguiremos hasta acabar con todo el relleno. Luego verteremos el resto de bechamel que teníamos reservada por encima, hasta cubrir todos los canelones. "
                ),
                Pasos(id = 8,
                    contenido = "Cubriremos con queso. A mi me gusta poner mozzarella para que se derrita y otro queso tipo filato para dar un poco de crujiente. Lo llevaremos al horno, pre-calentado a 180ºC. Cocinaremos unos 10 min y luego lo pondremos en modo gratinar hasta que se doren."
                )
            ),
            congrats = "¡Listo! Parece laborioso, pero en realidad el macerado y cocinado de la carne se hace solo y los sofritos de ambos tipos de canelones son muy sencillos.",
            done = false
        ),
        Receta(id = 4,
            nombre = "Sopa Minestrone",
            imagen = R.drawable.minestrone,
            descripcion = "Esta sopa es de origen italiano y, como ya os he contado en multitud de ocasiones, yo estudié en un colegio italiano. Por lo que a la hora de la comida o en casa de mis amigos, era un plato habitual. ",
            duracion = "60-70 min",
            raciones = "2 personas",
            dificultad = 2,
            ingredientes = mutableListOf(
                "500 gr cabeza de lomo (en pieza entera) o pollo",
                "1 cebolla grande",
                "30-40 placas de pasta para canelones",
                "Para la bechamel: 4 cdas colmadas mantequilla + 4 cdas colmadas harina + 3 y 1/2 vaso de leche + Sal + Nuez moscada",
                "Queso para gratinar"
            ),
            pasos = mutableListOf(
                Pasos(id = 1,
                    contenido = "Si optáis por hacer los canelones de carne maceada deberéis empezar unas 24h antes a prepararlos. Para ello empezaremos por el marinado. En un bol mezclaremos la mostaza, el ajo picado fino, el pimentón, la sal, la pimienta, el orégano, el jengibre, la miel y el aceite de oliva y haremos como una especie de pasta. Con ella embadurnaremos toda la pieza de carne, masajeándola bien. Luego añadiremos el zumo de la naranja y volveremos a masajear la carne y que se impregne bien. \n" +
                            "\n" +
                            "Luego pondremos la pieza en una bandeja o fuente y verteremos dentro la cerveza hasta cubrir la pieza. Taparemos con film y nos lo llevaremos a la nevera un mínimo de 12h, pero si está 24h mejor que mejor. Durante este tiempo os recomiendo ir dándole la vuelta a la pieza un par o tres de veces."
                ),
                Pasos(id = 2,
                    contenido = "Pasado el tiempo de reposo de la carne, será tiempo de cocinarla. La pondremos en una olla o cazuela y verteremos dentro todo el litro de caldo y el jugo del marinado colado. Taparemos la olla o cazuela. Llevaremos a ebullición y cuando empiece a hervir bajaremos el fuego al mínimo y cocinaremos durante 3 o 4 horas o hasta que veamos que la pieza está bien tierna. Si veis que se consume mucho el líquido podéis añadirle un pelín de agua. Este proceso también se puede hacer al horno, a 80ºC, también 3-4 horas.\n" +
                            "\n" +
                            "Una vez cocinada la pasaremos a un plato grande y con la ayuda de dos tenedores o las manos deshilaremos la pieza entera.\n" +
                            "\n" +
                            "Lo que sobre del caldo, lo pasaremos a un cazo y lo cocinaremos tapado, a fuego bajo, hasta que reduzca y se convierta en una salsa algo densa."
                ),
                Pasos(id = 3,
                    contenido = "Cuando ya tenemos la carne deshilada y la salsa hecha, ya podemos empezar el montaje de estos canelones. Prepararemos el sofrito. Para ello picaremos fina la cebolla y la pocharemos en una sartén. Cuando esté bien cocinada, añadiremos la carne y lo mezclaremos bien. Luego agregaremos 5 o 6 cdas de la salsa y lo integraremos todo muy bien. Reservaremos."
                ),
                Pasos(id = 4,
                    contenido = "Pondremos una olla a hervir y cocinaremos las placas de canelones según las instrucciones del paquete. Os recomiendo poner un poco de bicarbonato para que no se peguen entre ellas."
                ),
                Pasos(id = 5,
                    contenido = "Mientras se cocinan las placas prepararemos la bechamel. Para ello pondremos la mantequilla en un cazo u olla. Cuando se derrita, agregaremos la harina y removeremos constantemente unos minutos hasta que la harina se dore y se cocine un poco. Entonces agregaremos la leche, previamente calentada en el microondas, y no dejaremos de remover hasta que empiece a densificar. Cuando tengamos la textura deseada, añadiremos la sal y nuez moscada al gusto."
                ),
                Pasos(id = 6,
                    contenido = "Pondremos unas cucharadas de bechamel en el relleno, para que quede un poco más pastoso y sea más fácil de rellenar los canelones. También para darle sabor y jugosidad. Luego pondremos una capa fina de bechamel en la base de la fuente/s en la/s que serviremos los canelones. "
                ),
                Pasos(id = 7,
                    contenido = "Rellenaremos las placas de canelones y enrollaremos. Iremos poniendo los canelones rellenos en la fuente con la bechamel, y los colocaremos bastante juntos. Seguiremos hasta acabar con todo el relleno. Luego verteremos el resto de bechamel que teníamos reservada por encima, hasta cubrir todos los canelones. "
                ),
                Pasos(id = 8,
                    contenido = "Cubriremos con queso. A mi me gusta poner mozzarella para que se derrita y otro queso tipo filato para dar un poco de crujiente. Lo llevaremos al horno, pre-calentado a 180ºC. Cocinaremos unos 10 min y luego lo pondremos en modo gratinar hasta que se doren."
                )
            ),
            congrats = "¡Listo! Parece laborioso, pero en realidad el macerado y cocinado de la carne se hace solo y los sofritos de ambos tipos de canelones son muy sencillos.",
            done = true
        ),
        Receta(id = 5,
            nombre = "Puré de guisantes",
            imagen = R.drawable.pure_guisantes,
            descripcion = "Los guisantes son legumbres de la misma familia que los garbanzos. Son ricos en vitamina A, vitamina C, calcio y magnesio, además de ser una gran fuente de fibra. ",
            duracion = "60 min",
            raciones = "2 personas",
            dificultad = 2,
            ingredientes = mutableListOf(
                "500 gr cabeza de lomo (en pieza entera) o pollo",
                "1 cebolla grande",
                "30-40 placas de pasta para canelones",
                "Para la bechamel: 4 cdas colmadas mantequilla + 4 cdas colmadas harina + 3 y 1/2 vaso de leche + Sal + Nuez moscada",
                "Queso para gratinar"
            ),
            pasos = mutableListOf(
                Pasos(id = 1,
                    contenido = "Si optáis por hacer los canelones de carne maceada deberéis empezar unas 24h antes a prepararlos. Para ello empezaremos por el marinado. En un bol mezclaremos la mostaza, el ajo picado fino, el pimentón, la sal, la pimienta, el orégano, el jengibre, la miel y el aceite de oliva y haremos como una especie de pasta. Con ella embadurnaremos toda la pieza de carne, masajeándola bien. Luego añadiremos el zumo de la naranja y volveremos a masajear la carne y que se impregne bien. \n" +
                            "\n" +
                            "Luego pondremos la pieza en una bandeja o fuente y verteremos dentro la cerveza hasta cubrir la pieza. Taparemos con film y nos lo llevaremos a la nevera un mínimo de 12h, pero si está 24h mejor que mejor. Durante este tiempo os recomiendo ir dándole la vuelta a la pieza un par o tres de veces."
                ),
                Pasos(id = 2,
                    contenido = "Pasado el tiempo de reposo de la carne, será tiempo de cocinarla. La pondremos en una olla o cazuela y verteremos dentro todo el litro de caldo y el jugo del marinado colado. Taparemos la olla o cazuela. Llevaremos a ebullición y cuando empiece a hervir bajaremos el fuego al mínimo y cocinaremos durante 3 o 4 horas o hasta que veamos que la pieza está bien tierna. Si veis que se consume mucho el líquido podéis añadirle un pelín de agua. Este proceso también se puede hacer al horno, a 80ºC, también 3-4 horas.\n" +
                            "\n" +
                            "Una vez cocinada la pasaremos a un plato grande y con la ayuda de dos tenedores o las manos deshilaremos la pieza entera.\n" +
                            "\n" +
                            "Lo que sobre del caldo, lo pasaremos a un cazo y lo cocinaremos tapado, a fuego bajo, hasta que reduzca y se convierta en una salsa algo densa."
                ),
                Pasos(id = 3,
                    contenido = "Cuando ya tenemos la carne deshilada y la salsa hecha, ya podemos empezar el montaje de estos canelones. Prepararemos el sofrito. Para ello picaremos fina la cebolla y la pocharemos en una sartén. Cuando esté bien cocinada, añadiremos la carne y lo mezclaremos bien. Luego agregaremos 5 o 6 cdas de la salsa y lo integraremos todo muy bien. Reservaremos."
                ),
                Pasos(id = 4,
                    contenido = "Pondremos una olla a hervir y cocinaremos las placas de canelones según las instrucciones del paquete. Os recomiendo poner un poco de bicarbonato para que no se peguen entre ellas."
                ),
                Pasos(id = 5,
                    contenido = "Mientras se cocinan las placas prepararemos la bechamel. Para ello pondremos la mantequilla en un cazo u olla. Cuando se derrita, agregaremos la harina y removeremos constantemente unos minutos hasta que la harina se dore y se cocine un poco. Entonces agregaremos la leche, previamente calentada en el microondas, y no dejaremos de remover hasta que empiece a densificar. Cuando tengamos la textura deseada, añadiremos la sal y nuez moscada al gusto."
                ),
                Pasos(id = 6,
                    contenido = "Pondremos unas cucharadas de bechamel en el relleno, para que quede un poco más pastoso y sea más fácil de rellenar los canelones. También para darle sabor y jugosidad. Luego pondremos una capa fina de bechamel en la base de la fuente/s en la/s que serviremos los canelones. "
                ),
                Pasos(id = 7,
                    contenido = "Rellenaremos las placas de canelones y enrollaremos. Iremos poniendo los canelones rellenos en la fuente con la bechamel, y los colocaremos bastante juntos. Seguiremos hasta acabar con todo el relleno. Luego verteremos el resto de bechamel que teníamos reservada por encima, hasta cubrir todos los canelones. "
                ),
                Pasos(id = 8,
                    contenido = "Cubriremos con queso. A mi me gusta poner mozzarella para que se derrita y otro queso tipo filato para dar un poco de crujiente. Lo llevaremos al horno, pre-calentado a 180ºC. Cocinaremos unos 10 min y luego lo pondremos en modo gratinar hasta que se doren."
                )
            ),
            congrats = "¡Listo! Parece laborioso, pero en realidad el macerado y cocinado de la carne se hace solo y los sofritos de ambos tipos de canelones son muy sencillos.",
            done = false
        ),
        Receta(id = 6,
            nombre = "Nuggets de Brócoli",
            imagen = R.drawable.nuggets_brocoli,
            descripcion = "Son perfectos para hacer al horno o al sartén, y lo que es más importante, para tener ya cocinados en la nevera (unos 2-3 días) y prepararte un plato en 5 minutos, o para congelar sin cocinar y tener una reserva deliciosa. ",
            duracion = "45 min",
            raciones = "12-15 nuggets",
            dificultad = 1,
            ingredientes = mutableListOf(
                "500 gr cabeza de lomo (en pieza entera) o pollo",
                "1 cebolla grande",
                "30-40 placas de pasta para canelones",
                "Para la bechamel: 4 cdas colmadas mantequilla + 4 cdas colmadas harina + 3 y 1/2 vaso de leche + Sal + Nuez moscada",
                "Queso para gratinar"
            ),
            pasos = mutableListOf(
                Pasos(id = 1,
                    contenido = "Si optáis por hacer los canelones de carne maceada deberéis empezar unas 24h antes a prepararlos. Para ello empezaremos por el marinado. En un bol mezclaremos la mostaza, el ajo picado fino, el pimentón, la sal, la pimienta, el orégano, el jengibre, la miel y el aceite de oliva y haremos como una especie de pasta. Con ella embadurnaremos toda la pieza de carne, masajeándola bien. Luego añadiremos el zumo de la naranja y volveremos a masajear la carne y que se impregne bien. \n" +
                            "\n" +
                            "Luego pondremos la pieza en una bandeja o fuente y verteremos dentro la cerveza hasta cubrir la pieza. Taparemos con film y nos lo llevaremos a la nevera un mínimo de 12h, pero si está 24h mejor que mejor. Durante este tiempo os recomiendo ir dándole la vuelta a la pieza un par o tres de veces."
                ),
                Pasos(id = 2,
                    contenido = "Pasado el tiempo de reposo de la carne, será tiempo de cocinarla. La pondremos en una olla o cazuela y verteremos dentro todo el litro de caldo y el jugo del marinado colado. Taparemos la olla o cazuela. Llevaremos a ebullición y cuando empiece a hervir bajaremos el fuego al mínimo y cocinaremos durante 3 o 4 horas o hasta que veamos que la pieza está bien tierna. Si veis que se consume mucho el líquido podéis añadirle un pelín de agua. Este proceso también se puede hacer al horno, a 80ºC, también 3-4 horas.\n" +
                            "\n" +
                            "Una vez cocinada la pasaremos a un plato grande y con la ayuda de dos tenedores o las manos deshilaremos la pieza entera.\n" +
                            "\n" +
                            "Lo que sobre del caldo, lo pasaremos a un cazo y lo cocinaremos tapado, a fuego bajo, hasta que reduzca y se convierta en una salsa algo densa."
                ),
                Pasos(id = 3,
                    contenido = "Cuando ya tenemos la carne deshilada y la salsa hecha, ya podemos empezar el montaje de estos canelones. Prepararemos el sofrito. Para ello picaremos fina la cebolla y la pocharemos en una sartén. Cuando esté bien cocinada, añadiremos la carne y lo mezclaremos bien. Luego agregaremos 5 o 6 cdas de la salsa y lo integraremos todo muy bien. Reservaremos."
                ),
                Pasos(id = 4,
                    contenido = "Pondremos una olla a hervir y cocinaremos las placas de canelones según las instrucciones del paquete. Os recomiendo poner un poco de bicarbonato para que no se peguen entre ellas."
                ),
                Pasos(id = 5,
                    contenido = "Mientras se cocinan las placas prepararemos la bechamel. Para ello pondremos la mantequilla en un cazo u olla. Cuando se derrita, agregaremos la harina y removeremos constantemente unos minutos hasta que la harina se dore y se cocine un poco. Entonces agregaremos la leche, previamente calentada en el microondas, y no dejaremos de remover hasta que empiece a densificar. Cuando tengamos la textura deseada, añadiremos la sal y nuez moscada al gusto."
                ),
                Pasos(id = 6,
                    contenido = "Pondremos unas cucharadas de bechamel en el relleno, para que quede un poco más pastoso y sea más fácil de rellenar los canelones. También para darle sabor y jugosidad. Luego pondremos una capa fina de bechamel en la base de la fuente/s en la/s que serviremos los canelones. "
                ),
                Pasos(id = 7,
                    contenido = "Rellenaremos las placas de canelones y enrollaremos. Iremos poniendo los canelones rellenos en la fuente con la bechamel, y los colocaremos bastante juntos. Seguiremos hasta acabar con todo el relleno. Luego verteremos el resto de bechamel que teníamos reservada por encima, hasta cubrir todos los canelones. "
                ),
                Pasos(id = 8,
                    contenido = "Cubriremos con queso. A mi me gusta poner mozzarella para que se derrita y otro queso tipo filato para dar un poco de crujiente. Lo llevaremos al horno, pre-calentado a 180ºC. Cocinaremos unos 10 min y luego lo pondremos en modo gratinar hasta que se doren."
                )
            ),
            congrats = "¡Listo! Parece laborioso, pero en realidad el macerado y cocinado de la carne se hace solo y los sofritos de ambos tipos de canelones son muy sencillos.",
            done = true
        ),
        Receta(id = 7,
            nombre = "Hamburguesas Vegetarianas",
            imagen = R.drawable.burguer_vegetal,
            descripcion = "Hay muchas maneras de preparar hamburguesas vegetales. En Internet encontraréis de todo, muy complejas o con muy pocos ingredientes. ",
            duracion = "30-40 min",
            raciones = "6 hamburguesas",
            dificultad = 1,
            ingredientes = mutableListOf(
                "500 gr cabeza de lomo (en pieza entera) o pollo",
                "1 cebolla grande",
                "30-40 placas de pasta para canelones",
                "Para la bechamel: 4 cdas colmadas mantequilla + 4 cdas colmadas harina + 3 y 1/2 vaso de leche + Sal + Nuez moscada",
                "Queso para gratinar"
            ),
            pasos = mutableListOf(
                Pasos(id = 1,
                    contenido = "Si optáis por hacer los canelones de carne maceada deberéis empezar unas 24h antes a prepararlos. Para ello empezaremos por el marinado. En un bol mezclaremos la mostaza, el ajo picado fino, el pimentón, la sal, la pimienta, el orégano, el jengibre, la miel y el aceite de oliva y haremos como una especie de pasta. Con ella embadurnaremos toda la pieza de carne, masajeándola bien. Luego añadiremos el zumo de la naranja y volveremos a masajear la carne y que se impregne bien. \n" +
                            "\n" +
                            "Luego pondremos la pieza en una bandeja o fuente y verteremos dentro la cerveza hasta cubrir la pieza. Taparemos con film y nos lo llevaremos a la nevera un mínimo de 12h, pero si está 24h mejor que mejor. Durante este tiempo os recomiendo ir dándole la vuelta a la pieza un par o tres de veces."
                ),
                Pasos(id = 2,
                    contenido = "Pasado el tiempo de reposo de la carne, será tiempo de cocinarla. La pondremos en una olla o cazuela y verteremos dentro todo el litro de caldo y el jugo del marinado colado. Taparemos la olla o cazuela. Llevaremos a ebullición y cuando empiece a hervir bajaremos el fuego al mínimo y cocinaremos durante 3 o 4 horas o hasta que veamos que la pieza está bien tierna. Si veis que se consume mucho el líquido podéis añadirle un pelín de agua. Este proceso también se puede hacer al horno, a 80ºC, también 3-4 horas.\n" +
                            "\n" +
                            "Una vez cocinada la pasaremos a un plato grande y con la ayuda de dos tenedores o las manos deshilaremos la pieza entera.\n" +
                            "\n" +
                            "Lo que sobre del caldo, lo pasaremos a un cazo y lo cocinaremos tapado, a fuego bajo, hasta que reduzca y se convierta en una salsa algo densa."
                ),
                Pasos(id = 3,
                    contenido = "Cuando ya tenemos la carne deshilada y la salsa hecha, ya podemos empezar el montaje de estos canelones. Prepararemos el sofrito. Para ello picaremos fina la cebolla y la pocharemos en una sartén. Cuando esté bien cocinada, añadiremos la carne y lo mezclaremos bien. Luego agregaremos 5 o 6 cdas de la salsa y lo integraremos todo muy bien. Reservaremos."
                ),
                Pasos(id = 4,
                    contenido = "Pondremos una olla a hervir y cocinaremos las placas de canelones según las instrucciones del paquete. Os recomiendo poner un poco de bicarbonato para que no se peguen entre ellas."
                ),
                Pasos(id = 5,
                    contenido = "Mientras se cocinan las placas prepararemos la bechamel. Para ello pondremos la mantequilla en un cazo u olla. Cuando se derrita, agregaremos la harina y removeremos constantemente unos minutos hasta que la harina se dore y se cocine un poco. Entonces agregaremos la leche, previamente calentada en el microondas, y no dejaremos de remover hasta que empiece a densificar. Cuando tengamos la textura deseada, añadiremos la sal y nuez moscada al gusto."
                ),
                Pasos(id = 6,
                    contenido = "Pondremos unas cucharadas de bechamel en el relleno, para que quede un poco más pastoso y sea más fácil de rellenar los canelones. También para darle sabor y jugosidad. Luego pondremos una capa fina de bechamel en la base de la fuente/s en la/s que serviremos los canelones. "
                ),
                Pasos(id = 7,
                    contenido = "Rellenaremos las placas de canelones y enrollaremos. Iremos poniendo los canelones rellenos en la fuente con la bechamel, y los colocaremos bastante juntos. Seguiremos hasta acabar con todo el relleno. Luego verteremos el resto de bechamel que teníamos reservada por encima, hasta cubrir todos los canelones. "
                ),
                Pasos(id = 8,
                    contenido = "Cubriremos con queso. A mi me gusta poner mozzarella para que se derrita y otro queso tipo filato para dar un poco de crujiente. Lo llevaremos al horno, pre-calentado a 180ºC. Cocinaremos unos 10 min y luego lo pondremos en modo gratinar hasta que se doren."
                )
            ),
            congrats = "¡Listo! Parece laborioso, pero en realidad el macerado y cocinado de la carne se hace solo y los sofritos de ambos tipos de canelones son muy sencillos.",
            done = true
        ),
        Receta(id = 8,
            nombre = "Rollitos de Primavera",
            imagen = R.drawable.rollitos_primavera,
            descripcion = "Los rollitos de primavera son un clásico y un must si vas a cualquier restaurante chino. En casa intentamos evitar las frituras a toda costa, de hecho hace años que hacemos las croquetas y empanadillas al horno, el huevo “frito” a la plancha",
            duracion = "45 min",
            raciones = "16 rollitos",
            dificultad = 2,
            ingredientes = mutableListOf(
                "500 gr cabeza de lomo (en pieza entera) o pollo",
                "1 cebolla grande",
                "30-40 placas de pasta para canelones",
                "Para la bechamel: 4 cdas colmadas mantequilla + 4 cdas colmadas harina + 3 y 1/2 vaso de leche + Sal + Nuez moscada",
                "Queso para gratinar"
            ),
            pasos = mutableListOf(
                Pasos(id = 1,
                    contenido = "Si optáis por hacer los canelones de carne maceada deberéis empezar unas 24h antes a prepararlos. Para ello empezaremos por el marinado. En un bol mezclaremos la mostaza, el ajo picado fino, el pimentón, la sal, la pimienta, el orégano, el jengibre, la miel y el aceite de oliva y haremos como una especie de pasta. Con ella embadurnaremos toda la pieza de carne, masajeándola bien. Luego añadiremos el zumo de la naranja y volveremos a masajear la carne y que se impregne bien. \n" +
                            "\n" +
                            "Luego pondremos la pieza en una bandeja o fuente y verteremos dentro la cerveza hasta cubrir la pieza. Taparemos con film y nos lo llevaremos a la nevera un mínimo de 12h, pero si está 24h mejor que mejor. Durante este tiempo os recomiendo ir dándole la vuelta a la pieza un par o tres de veces."
                ),
                Pasos(id = 2,
                    contenido = "Pasado el tiempo de reposo de la carne, será tiempo de cocinarla. La pondremos en una olla o cazuela y verteremos dentro todo el litro de caldo y el jugo del marinado colado. Taparemos la olla o cazuela. Llevaremos a ebullición y cuando empiece a hervir bajaremos el fuego al mínimo y cocinaremos durante 3 o 4 horas o hasta que veamos que la pieza está bien tierna. Si veis que se consume mucho el líquido podéis añadirle un pelín de agua. Este proceso también se puede hacer al horno, a 80ºC, también 3-4 horas.\n" +
                            "\n" +
                            "Una vez cocinada la pasaremos a un plato grande y con la ayuda de dos tenedores o las manos deshilaremos la pieza entera.\n" +
                            "\n" +
                            "Lo que sobre del caldo, lo pasaremos a un cazo y lo cocinaremos tapado, a fuego bajo, hasta que reduzca y se convierta en una salsa algo densa."
                ),
                Pasos(id = 3,
                    contenido = "Cuando ya tenemos la carne deshilada y la salsa hecha, ya podemos empezar el montaje de estos canelones. Prepararemos el sofrito. Para ello picaremos fina la cebolla y la pocharemos en una sartén. Cuando esté bien cocinada, añadiremos la carne y lo mezclaremos bien. Luego agregaremos 5 o 6 cdas de la salsa y lo integraremos todo muy bien. Reservaremos."
                ),
                Pasos(id = 4,
                    contenido = "Pondremos una olla a hervir y cocinaremos las placas de canelones según las instrucciones del paquete. Os recomiendo poner un poco de bicarbonato para que no se peguen entre ellas."
                ),
                Pasos(id = 5,
                    contenido = "Mientras se cocinan las placas prepararemos la bechamel. Para ello pondremos la mantequilla en un cazo u olla. Cuando se derrita, agregaremos la harina y removeremos constantemente unos minutos hasta que la harina se dore y se cocine un poco. Entonces agregaremos la leche, previamente calentada en el microondas, y no dejaremos de remover hasta que empiece a densificar. Cuando tengamos la textura deseada, añadiremos la sal y nuez moscada al gusto."
                ),
                Pasos(id = 6,
                    contenido = "Pondremos unas cucharadas de bechamel en el relleno, para que quede un poco más pastoso y sea más fácil de rellenar los canelones. También para darle sabor y jugosidad. Luego pondremos una capa fina de bechamel en la base de la fuente/s en la/s que serviremos los canelones. "
                ),
                Pasos(id = 7,
                    contenido = "Rellenaremos las placas de canelones y enrollaremos. Iremos poniendo los canelones rellenos en la fuente con la bechamel, y los colocaremos bastante juntos. Seguiremos hasta acabar con todo el relleno. Luego verteremos el resto de bechamel que teníamos reservada por encima, hasta cubrir todos los canelones. "
                ),
                Pasos(id = 8,
                    contenido = "Cubriremos con queso. A mi me gusta poner mozzarella para que se derrita y otro queso tipo filato para dar un poco de crujiente. Lo llevaremos al horno, pre-calentado a 180ºC. Cocinaremos unos 10 min y luego lo pondremos en modo gratinar hasta que se doren."
                )
            ),
            congrats = "¡Listo! Parece laborioso, pero en realidad el macerado y cocinado de la carne se hace solo y los sofritos de ambos tipos de canelones son muy sencillos.",
            done = false
        )
    )


){

    fun getRecetario(): MutableList<Receta>{
        return recetario
    }

    fun getReceta(id: Int): Receta{

        val size = recetario.size - 1

        for (i: Int in (0..size)){
            if (recetario[i].getId() == id) return recetario[i]
        }

        return recetario[0]
    }
}