# Instructions

## Getting Started 

* Download [grails](https://grails.org/download.html)

## How to run the example

```
git clone https://github.com/luisas/GrailsEasyExample

cd GrailsEasyExample/newapp

grails run-app
```

Then in your browser look for http://localhost:8080 .

## How to create this simple App from scratch

**1. Create the grail application and the main controller:**
```
grails create-app newapp

cd newapp

grails create-controller mycontroller
```

**2. Create a view in the mycontroller repository:**
```
cd grails-app/views/mycontroller

touch myview.gsp
```

**3. Modify [main.gsp](https://github.com/luisas/GrailsEasyExample/blob/master/newapp/grails-app/views/layouts/main.gsp) file**

Add a line to the navigation bar to add the connection to another webpage.
```
<li><g:link controller="mycontroller">other page</g:link></li>
```
In this way, when clicking on the button "other page" on the navigation bar of the web application the method index() of the mycontroller Controller will be called.
As off now, the method is not doing anything but we will change this in the next step.


**4. Modify the views**

First delete stuff you don't need from the templates of the [index.gsp](https://github.com/luisas/GrailsEasyExample/blob/master/newapp/grails-app/views/index.gsp) view and add a plain welcome sentence.

```
<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
</head>
<body>

  </div>
  <center><h1>Welcome to my new Website</h1></center>

</body>

```

Then modify the [views/myview.gsp](https://github.com/luisas/GrailsEasyExample/blob/master/newapp/grails-app/views/mycontroller/myview.gsp) 

Here I added a plain g:form for collecting the name and eventually the "${line}" line, which is responsible for printig out the greeting with the name collected from the g:form.
The value typed in in the form can be accessed from the controller "mycontroller", as specified by the controller="mycontroller" in the g:form. The controller can access this value by using ${params.name}, as defined in the "name=name" of the g:textfield.


5. **Modify the [Controller](https://github.com/luisas/GrailsEasyExample/blob/master/newapp/grails-app/controllers/newapp/MycontrollerController.groovy).**

Modify the index() method by adding the line : 
```
render view: "/mycontroller/myview", model: []
```

So that the view "/mycontroller/myview" is shown when the method is called.

Moreover add another method called shown().
This accesses the parameter called name by calling $params.name. This parameter corresponds to the value the user types in the textfield with "name=name" in the view "myview. 
Then saves a sentence in a variable called line and makes it accessible to the view by using model: [line:line].
From the view we can then access to this line by typing ${line}.
