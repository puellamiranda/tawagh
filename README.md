## Raport z testów

#### 1. Wprowadzenie przedmiotów do systemu w podanej kolejności:
- Nazwa: Metodologie obiektowe, ECTS: 2, Sala: 216, Egzamin: tak,
- Nazwa: Testowanie oprogramowania, ECTS: 1, Sala: 216, Egzamin: nie,
- Nazwa: Technologie i aplikacje webowe, ECTS: 3, Sala: 208, Egzamin: nie,
- Nazwa: Zarządzanie projektem informatycznym, ECTS: 2, Sala: 216, Egzamin: nie,
- Nazwa: Zaawansowane technologie bazodanowe, ECTS: 3, Sala: 208, Egzamin: nie,
- Nazwa: Technologie komponentowe i sieciowe, ECTS: 2, Sala: 208, Egzamin: tak



Metoda: POST

Adres zasobu: http://localhost:8080/api/studia

Nagłówki: Content-Type: application/json

Request Body: 

{

"przedmiot":"Metodologie obiektowe",

"ects":2,

"sala":216,

"egzamin":"true"

}


Odpowiedź:
HTTP Code: 200 OK

Body: brak




Metoda: POST

Adres zasobu: http://localhost:8080/api/studia

Nagłówki: Content-Type: application/json

Request Body: 

{

"przedmiot":"Testowanie oprogramowania",

"ects":1,

"sala":216,

"egzamin":"false"

}


Odpowiedź:
HTTP Code: 200 OK

Body: brak




Metoda: POST

Adres zasobu: http://localhost:8080/api/studia

Nagłówki: Content-Type: application/json

Request Body: 

{

"przedmiot":"Technologie i aplikacje webowe",

"ects":3,

"sala":208,

"egzamin":"false"

}


Odpowiedź:
HTTP Code: 200 OK

Body: brak




Metoda: POST

Adres zasobu: http://localhost:8080/api/studia

Nagłówki: Content-Type: application/json

Request Body: 

{

"przedmiot":"Zarządzanie projektem informatycznym",

"ects":2,

"sala":216,

"egzamin":"false"

}


Odpowiedź:
HTTP Code: 200 OK

Body: brak




Metoda: POST

Adres zasobu: http://localhost:8080/api/studia

Nagłówki: Content-Type: application/json

Request Body: 

{

"przedmiot":"Zaawansowane technologie bazodanowe",

"ects":3,

"sala":208,

"egzamin":"false"

}


Odpowiedź:
HTTP Code: 200 OK

Body: brak




Metoda: POST

Adres zasobu: http://localhost:8080/api/studia

Nagłówki: Content-Type: application/json

Request Body: 

{

"przedmiot":"Technologie komponentowe i sieciowe",

"ects":2,

"sala":208,

"egzamin":"true"

}



Odpowiedź:
HTTP Code: 200 OK

Body: brak



#### 2. Pobranie wszystkich przedmiotów.



Metoda: GET

Adres zasobu: http://localhost:8080/api/studia

Nagłówki: Content-Type: application/json

Request Body: brak



Odpowiedź:
HTTP Code: 200 OK

Body: 

[

{

"id": 1,

"przedmiot": "Metodologie obiektowe",

"ects": 2,

"sala": 216,

"egzamin": true

},

{

"id": 2,

"przedmiot": "Testowanie oprogramowania",

"ects": 1,

"sala": 216,

"egzamin": false

},

{

"id": 3,

"przedmiot": "Technologie i aplikacje webowe",

"ects": 3,

"sala": 208,

"egzamin": false

},

{

"id": 4,

"przedmiot": "Zarządzanie projektem informatycznym",

"ects": 2,

"sala": 216,

"egzamin": false

},

{

"id": 5,

"przedmiot": "Zaawansowane technologie bazodanowe",

"ects": 3,

"sala": 208,

"egzamin": false

},

{

"id": 6,

"przedmiot": "Technologie komponentowe i sieciowe",

"ects": 2,

"sala": 208,

"egzamin": true

}

]



#### 3.Pobranie przedmiotów, które mają egzamin.



Metoda: GET

Adres zasobu: http://localhost:8080/api/studia?egzamin=tak

Nagłówki: Content-Type: application/json

Request Body: brak



Odpowiedź:
HTTP Code: 200 OK

Body: 

[

{

"id": 1,

"przedmiot": "Metodologie obiektowe",

"ects": 2,

"sala": 216,

"egzamin": true

},

{

"id": 6,

"przedmiot": "Technologie komponentowe i sieciowe",

"ects": 2,

"sala": 208,

"egzamin": true

}

]



#### 4. Pobranie przedmiotów, które odbywają się w sali 216.



Metoda: GET

Adres zasobu: http://localhost:8080/api/studia?sala=216

Nagłówki: Content-Type: application/json

Request Body: brak



Odpowiedź:
HTTP Code: 200 OK

Body: 

[

{

"id": 1,

"przedmiot": "Metodologie obiektowe",

"ects": 2,

"sala": 216,

"egzamin": true

},

{

"id": 2,

"przedmiot": "Testowanie oprogramowania",

"ects": 1,

"sala": 216,

"egzamin": false

},

{

"id": 4,

"przedmiot": "Zarządzanie projektem informatycznym",

"ects": 2,

"sala": 216,

"egzamin": false

}

]



#### 5. Pobranie przedmiotów które nie mają egzaminu i odbywają się w sali 208.



Metoda: GET

Adres zasobu: http://localhost:8080/api/studia?egzamin=nie&&sala=208

Nagłówki: Content-Type: application/json

Request Body: brak



Odpowiedź:
HTTP Code: 200 OK

Body: 

[

{

"id": 3,

"przedmiot": "Technologie i aplikacje webowe",

"ects": 3,

"sala": 208,

"egzamin": false

},

{

"id": 5,

"przedmiot": "Zaawansowane technologie bazodanowe",

"ects": 3,

"sala": 208,

"egzamin": false

}

]



#### 6. Pobranie przedmiotu o identyfikatorze 3.



Metoda: GET

Adres zasobu: http://localhost:8080/api/studia/3

Nagłówki: Content-Type: application/json

Request Body: brak



Odpowiedź:
HTTP Code: 200 OK

Body: 

{

"id": 3,

"przedmiot": "Technologie i aplikacje webowe",

"ects": 3,

"sala": 208,

"egzamin": false

}



#### 7. Pobranie przedmiotu o identyfikatorze 15.



Metoda: GET

Adres zasobu: http://localhost:8080/api/studia/15

Nagłówki: Content-Type: application/json

Request Body: brak



Odpowiedź:
HTTP Code: 404 Not Found

Body: brak



#### 8. Usunięcie przedmiotu o identyfikatorze 2.


Metoda: DELETE

Adres zasobu: http://localhost:8080/api/studia/2

Nagłówki: Content-Type: application/json

Request Body: brak



Odpowiedź:
HTTP Code: 204 No Content

Body: brak



#### 9. Pobranie wszystkich przedmiotów.



Metoda: GET

Adres zasobu: http://localhost:8080/api/studia

Nagłówki: Content-Type: application/json

Request Body: brak



Odpowiedź:
HTTP Code: 200 OK

Body:

[

{

"id": 1,

"przedmiot": "Metodologie obiektowe",

"ects": 2,

"sala": 216,

"egzamin": true

},

{

"id": 3,

"przedmiot": "Technologie i aplikacje webowe",

"ects": 3,

"sala": 208,

"egzamin": false

},

{

"id": 4,

"przedmiot": "Zarządzanie projektem informatycznym",

"ects": 2,

"sala": 216,

"egzamin": false

},

{

"id": 5,

"przedmiot": "Zaawansowane technologie bazodanowe",

"ects": 3,

"sala": 208,

"egzamin": false

},

{

"id": 6,

"przedmiot": "Technologie komponentowe i sieciowe",

"ects": 2,

"sala": 208,

"egzamin": true

}

]



#### 10. Usunięcie wszystkich przedmiotów.



Metoda: DELETE

Adres zasobu: http://localhost:8080/api/studia

Nagłówki: Content-Type: application/json

Request Body: brak



Odpowiedź:
HTTP Code: 200 OK

Body: brak



#### 11. Pobranie wszystkich przedmiotów.



Metoda: GET

Adres zasobu: http://localhost:8080/api/studia

Nagłówki: Content-Type: application/json

Request Body: brak



Odpowiedź:
HTTP Code: 200 OK

Body:

[]
