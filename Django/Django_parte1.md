
(En construcción)

Django es un framework basado en Python, muy utilizado al momento de escribir este post. Entre sus ventajas  destaca el hecho de que el propio framework genera toda la estructura de archivos para proyectos y aplicaciones. Esto permite al equipo de desarrollo concentrarse en las funcionalidades de un proyecto y construirlo incremental y modularmente.

**Requisitos:**

- Python 3, disponible en python.org.
- Conocimientos básicos de la línea de comandos de su sistema operativo: `cmd` en Windows y el terminal en sistemas operativos basados en UNIX, como MacOS y Linux.

Se recomienda usar papel y lápiz para generar su propios apuntes de lo que sigue.

##### 1. Instalar Django

[Más info en w3schools](https://www.w3schools.com/django/django_getstarted.php])

**Python:**

En la línea de comandos, verifique qué versión de Python tiene instalada en su sistema.

`python --version` o `python3 --version`

**Django:** 

Debe tener en consideración de tener permisos de Administrador en Windows para esta instalación.

En la línea de comandos de su sistema operativo instale Django con el siguiente comando:

`pip install django`

o

`pip3 install django`


##### 2. Conceptos Django: Proyectos, Aplicaciones (o módulos), Vistas y URLs 
![[que-son-aplicaciones-django.png]]
Fuente figura: [pybaq.co](https://pybaq.co/blog/una-guia-completa-de-django-para-principiantes-parte-1/)

![[Captura de Pantalla 2024-12-20 a la(s) 10.26.58.png]]

Imagina que tu **proyecto** Django (rectángulo verde en fig. anterior) es una casa.

Las **aplicaciones** (círculos amarillos en figura) serían como las diferentes habitaciones, cada una con su propia función. Por ejemplo, podrías tener una aplicación para el blog, otra para la tienda en línea, y otra para gestionar usuarios.

Las **vistas** son como las ventanas de esas habitaciones. Son las partes del código que determinan qué se mostrará en cada página de tu sitio web. Cuando alguien visita una página específica, Django busca la vista correspondiente y le pide que prepare el contenido.

Las **URLs** son como las direcciones de esas habitaciones. Le dicen a Django a qué vista debe ir cuando alguien escribe una dirección en el navegador. Por ejemplo, la URL /blog/ podría llevar a la vista principal de tu blog.

##### Llevémoslo a la práctica:
###### 2.1 Proyecto:

Para crear un proyecto y toda su estructura de archivos:

`django-admin startproject NOMBRE_PROYECTO`

**ej:** `django-admin startproject proyecto`

###### 2.2 Servidor

Para comprobar si funciona el servidor, ejecutar:

`python3 manage.py runserver`

###### 2.3 Aplicaciones

**i) Crear aplicación y su estructura de archivos:**

`python3 manage.py startapp NOMBRE_APLICACION`

**ej:** `python3 manage.py startapp miAplicacion`


**ii) Configurar archivos:**


**Vistas:**

Por ahora vamos a copiar/pegar el código a continuación, editando `views.py` dentro de la carpeta `miAplicacion`:

```python
from django.shortcuts import render
from django.http import HttpResponse

def members(request):
    return HttpResponse("Hola Mundo!")
```

En código, una Vista no es más que una función que retorna el contenido de una web.

**Rutas o URLs**

Igualmente copiar/pegar el código a continuación en el archivo urls.py del proyecto: `proyecto/proyecto/urls.py`:

```PYTHON
from django.contrib import admin
from django.urls import include, path

urlpatterns = [
    path('', include('miAplicacion.urls')),
    path('admin/', admin.site.urls),
]
```


**iii) Agregar aplicación al proyecto:**

en `settings.py` del proyecto:

``` python
INSTALLED_APPS = [
'django.contrib.admin',
'django.contrib.auth',
'django.contrib.contenttypes',
'django.contrib.sessions',
'django.contrib.messages',
'django.contrib.staticfiles',
'miAplicacion',
]
```

(CONTINUARÁ)