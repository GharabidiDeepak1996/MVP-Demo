# Android MVP

1.Model

Everything which is related with data is a part of the Model. The Model contains a data provider and the code which fetches and updates the data

2. Presenter

The Presenter contains the application's business logic and when an operation is performed or data is changed then it will notify the View that it needs to update.

3. View

The View is controlled by the Presenter.
The way we represent our data e.g. Views/layouts as well as Activities/Fragments in Android.

-------------------------------------------------------------------------------------------------

![image](https://imgur.com/yojWypp.jpg)

---->Difference in MVP and MVVM.

***ViewModel replaces the Presenter in the Middle Layer***

***The Presenter holds references to the View. The ViewModel doesn’t.***

***The Presenter updates the View using the classical way (triggering methods).***

***The ViewModel sends data streams.***

***The Presenter and View are in a 1 to 1 relationship.***

***The View and the ViewModel are in a 1 to many relationship.***

***The ViewModel does not know that the View is listening to it.***

***In MVP presenter hold the view,But MVVM viewmodel does not holding view.***
