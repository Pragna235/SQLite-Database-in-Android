# SQLite-Database-in-Android ( Experiment 7 )

### Report - https://github.com/Pragna235/SQLite-Database-in-Android/blob/master/MAD%20EXP%207.pdf

## Playbook

* Create a `New Project` with `No Activity`
* Create a new `Empty Views Activity` as a `launcher activity`
* Open the `xml file` code part
* Remove the `Constraint Layout` and add an `Relative Layout` in the code part
* Add a `TextView` and `EditText` as required.
* The `Design` will be as follows till now :
* ![Screenshot 2024-03-02 100836](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/9d269dbc-69c0-426b-b7ab-7607aec2c753)

* Add 4 `Button` now and it looks like this
* ![Screenshot 2024-03-02 101820](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/c7336baa-fa51-403e-b537-7e8d00c394a2)




* Now open the `Main Activity` and add 4 methods similar to the below to define the action needed to be taken when the respective button is clicked
*     public void insertStudent(View v){

      }
* Select the buttons on `xml design` and map their `onclick()` attribute to the respective methods
* Now in our `Main Activity` create a new `Java class` as a sub class, say `StudentDBHelper`
* Name it and do the code and handle the errors
* Initially, it looks like this
* ![Screenshot 2024-03-02 102400](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/2d82dad0-e8e6-4eb3-9448-3f1dd1030ca7)

* Make changes in the `constructor` and `methods` in the code
* Add other methods and call them in the `MainActivity.java`
* Make changes in the `MainActivity.java` code
* Run the app and try to insert a student data
* If any error occurs, install `plugins called SimpleSQLiteBrowser and SQL Helper` from the `File` > `Settings` and `Plugins` and then run the app.
* The toast should show `Insertion is Successful`
* ![Screenshot 2024-03-02 112144](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/04dbb8f2-da48-4819-861e-26166b268f12)


* Check whether your data in inserted int the table or not :
* Open, Your `Device Manager` > `Open in Device Explorer` > `data` > `data` > `your experiment` > `databases` > `student.db` .
* Inserted data will be displayed.
* ![Screenshot 2024-03-02 112643](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/bed70d36-4a1d-4b37-a6c1-e72cbcc48f74)


* Similarly write the remaining methods `update`, `delete` and `get`and call them in the `MainActivity.java`
* ![Screenshot 2024-03-02 112758](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/f2dee046-2a45-4724-ad5b-6c824c0d8b57)
* ![Screenshot 2024-03-02 112852](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/101db946-d9f0-4ee4-a7a9-8323aea21eca)

* ![Screenshot 2024-03-02 113634](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/cb2fd499-1256-4c32-9248-e8997701fa59)

* 
* ![Screenshot 2024-03-02 113753](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/6bfec1b8-4cc5-4450-af7b-b2636384b10e)

* ![Screenshot 2024-03-02 115516](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/bd75a262-4de5-4f4b-a419-fe9c613b7a46)

* ![Screenshot 2024-03-02 115543](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/93af9203-a3c7-46d1-b833-7fdca0781e62)

### Reference - https://docs.google.com/presentation/d/1fnF5yram49dtxPmyLLKM9-0n8FOK1UflJdoWLxDNb98/edit#slide=id.p






