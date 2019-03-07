var alumnos=[{
    "nombre": "Estudiante 1",
    "curso": "1º ESO",
    "calificaciones": [
        ["Matemáticas", 10],
        ["Lengua", 7],
        ["Ingles", 8],
        ["Educación Física",7]
    ]
},
{
    "nombre": "Estudiante 2",
    "curso": "4º ESO",
    "calificaciones": [
        ["Física", 5],
        ["Lengua", 7],
        ["Química", 8],
        ["Tecnología",5]
    ]
},
{
    "nombre": "Estudiante 3",
    "curso": "3º ESO",
    "calificaciones": [
        ["Historia", 2],
        ["Naturaleza", 6],
        ["Ingles", 8],
        ["Francés",9]
    ]
},
{
    "nombre": "Estudiante 4",
    "curso": "2º ESO",
    "calificaciones": [
        ["Matemáticas", 4],
        ["Química", 9],
        ["Naturaleza", 7],
        ["Alemán",9],
        ["Frances",4],
        ["Biología",7]
    ]
}
];

onload=listado;
window.addEventListener("load", pintar, false);

//carga la la información de selección en el select

function listado() {
	var i;
	var textoHTML = '<option id="vacio">Seleccionar a un estudiante</option>';
	for (i in alumnos) {
		textoHTML = textoHTML + "<option value='" + i 
		 + "'>" + alumnos[i].nombre + "</option>";
	} 
	document.getElementById("lista").innerHTML = textoHTML;
} 

//Función que escucha los eventos de modificación del select
function pintar(){

    document.getElementById("lista").addEventListener("change", remover, false);
    document.getElementById("lista").addEventListener("change", rellenar, false);
}

//Función para cargar la información seleccionada al cambiar la opción del select.
function rellenar() {

	var i = document.getElementById("lista").value;
    var alumno = alumnos[i];
    var media=0;
    var cont=0;

    document.getElementById("nombre").innerText = alumno.nombre;
    document.getElementById("curso").innerText = alumno.curso;
    var tabla = document.getElementById("tabla");

    for(var j=0;j<alumno.calificaciones.length;j++){

        var linea=document.createElement("tr");

        for(var l=0;l<2;l++){

            var celda=document.createElement("td");
            var content = document.createTextNode(alumno.calificaciones[j][l]);
            celda.appendChild(content);
            linea.appendChild(celda);
        }
        cont=cont+1;
        tabla.appendChild(linea);
        media= media + alumno.calificaciones[j][1];
    }
    media=media/cont;
    document.getElementById("media").innerText = media.toFixed(2);

}

//Función para eliminar la información cargada anteriormente al cambiar la opción del select.
function remover(){

    if(document.getElementById("vacio")){

        document.getElementById("nombre").innerHTML="Nombre";
        document.getElementById("curso").innerHTML="Curso";
        document.getElementById("tabla").innerHTML="";
        document.getElementById("media").innerHTML="0";
    } else {

        document.getElementById("tabla").innerHTML="";
    }

}
