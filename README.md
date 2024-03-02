# SQLite-Database-in-Android ( Experiment 7 )

## Playbook

* Create a `New Project` with `No Activity`
* Create a new `Empty Views Activity` as a `launcher activity`
* Open the `xml file` code part
* Remove the `Constraint Layout` and add an `Relative Layout` in the code part
* Add a `TextView` and `EditText` as required.
* The `Design` will be as follows till now :
* ![image](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/d3c902d7-ddcc-4728-820e-d7d57274c37a)
* Add 4 `Button` now and it looks like this
* ![image](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/15eac11d-5884-45ef-ac37-a12be49eda6a)


* Now open the `Main Activity` and add 4 methods similar to the below to define the action needed to be taken when the respective button is clicked
*     public void insertStudent(View v){

      }
* Select the buttons on `xml design` and map their `onclick()` attribute to the respective methods
* Now in our `Main Activity` create a new `Java class` as a sub class, say `StudentDBHelper`
* Name it and do the code and handle the errors
* Initially, it looks like this
* ![image](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/636c6cd9-b2bc-4b1a-bb17-e6961dab2da0)
* Make changes in the `constructor` and `methods` in the code
* Add other methods and call them in the `MainActivity.java`
* Make changes in the `MainActivity.java` code
* Run the app and try to insert a student data
* If any error occurs, install `plugins called SimpleSQLiteBrowser and SQL Helper` from the `File` > `Settings` and `Plugins` and then run the app.
* The toast should show `Insertion is Successful`
* ![Screenshot 2024-03-02 112144](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/25a3e029-38ba-4fda-b8fe-edb5a2ccf2a1)

* Check whether your data in inserted int the table or not :
* Open, Your `Device Manager` > `Open in Device Explorer` > `data` > `data` > `your experiment` > `databases` > `student.db` .
* Inserted data will be displayed.
* ![image](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/3ad0cca9-c1f5-4f81-a299-8e2d03cc2f68)

* Similarly write the remaining methods `update`, `delete` and `get`and call them in the `MainActivity.java`
* ![Screenshot 2024-03-02 112758](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/942990a6-428d-4907-8ef9-162ff72fa1b9)
* ![image](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/1cecb24c-5774-41eb-8c3e-1da19e32435f)
* ![Screenshot 2024-03-02 113634](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/3a6f325d-b02f-487b-9156-6a6977762bea)
* ![image](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/ce78e3db-41e7-410a-b762-499d5052558e)
* ![Screenshot 2024-03-02 115516](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/e868a60c-6990-48b8-bf5b-5109a30670b5)
* ![Screenshot 2024-03-02 115543](https://github.com/Pragna235/SQLite-Database-in-Android/assets/109524200/4071ec19-4295-4330-8dd0-e733dd46c5cc)







