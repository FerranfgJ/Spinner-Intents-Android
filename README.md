# Spinner-Intents-Android

# <u>Enunciat</u>

**Objectius:**

·         Explicar el control Spinner

·         Parametritzar des de disseny el Spinner (característiques Prompt i Entries) des del String.xml de forma automàtica.

·         Parametritzar en temps d’execució les opcions i el control de le Spinner.

·         Profunditzar en els Intents, cridant a l’enviament d’un mail.

·         Característica **Hint**   (visualització si el view està buit) d’alguns view.

·         Característica **Input Type** dels editText.

**Seguir l’explicació a classe sobre el projector per part del professor de**

·         Crear aplicació per tal d’enviar un correu electrònic.

·         Es presenta un formulari amb les dades bàsiques i es donarà l’opció de l’enviament del mail.

·         Hi haurà una opció per auto-enviar-nos copia a nosaltres mateixos.

·         Creació d’un Intent per enviar correo:

Intent emailIntent \= **new** Intent(android.content.Intent.*ACTION\_SEND*);

Veure l’ajuda d’ACTION\_SEND per veure les dades que necessita: (android.content.Intent.***EXTRA\_EMAIL**,*  android.content.Intent.***EXTRA\_CC**,* android.content.Intent.***EXTRA\_SUBJECT**,* android.content.Intent.***EXTRA\_TEXT**)*

·         startActivity(Intent.***createChooser***(email Intent, "Enviar correo...")); CreateChooser fa que si hi ha més d’una aplicació per enviar correu, es pugui escollir quina fer servir.

Si no es posa ***Intent.createChooser( ... , ...);***  i no hi ha cap aplicació per enviar mail, peta.







**Ampliar i/o fer lectura dels següents apunts:**

·         Curso Programacion Salvador Gomez Oliver. 13-Depuracion de aplicaciones (Pàg. 219+)

. 	[Documentació Intents](https://developer.android.com/reference/android/content/Intent.html)

·         [Teoria d’aquest Recurs R1-Intents](https://docs.google.com/document/d/1bHOBSzFBQ350e_BAno9zmTbjekymeRQrpUjL-ia3H6A/edit?usp=sharing)

·         Transparències. Intents (Pàg. 34, 37\)

·         Beginning Android Application Development.  Charter 2 Activities and intents  (pàg.43-71)

·         Curso Programacion Salvador Gomez Oliver.  Listas desplegables (Pàg.38-41)

·         Beginning Android Application Development.  Charter 4 Desegning your .... List Views  (pàg.156-166)





**Fer a classe:**

·         Reproduir l’exercici desenvolupat pel professor. Ampliar-lo per tal d’enviar CORRECTAMENT un mail a ***milbicis@gmail.com.***

Extres (opcionals)

·         Fer una  petita aplicació que demani 4 textos fent servir EditText,i que mostri un Spinner amb aquestes opcions. No es podrà seleccionar res si no estan introduïdes les 4 possibilitats als edittexts.

.  Ampliar l’app anterior per tal que la primera activity tingui un botó per “Afegir” textos a l’spinner. Per tal d’afegir, cal cridar a una segona activity. Aquesta segona activity, demanarà el text i el retornarà, o no (botó Acceptar o Cancel·lar) a la primera activity per afegir-la a l’espinner.