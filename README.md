# Data Binding with View Binding

#### Documentation here <br />
<b>Data Binding</b> https://developer.android.com/topic/libraries/data-binding <br />
<b>View Binding</b> https://developer.android.com/topic/libraries/view-binding#java

<p>
  <strong>Note</strong> that this strategy is effective as it reduces the processing time. This style does not advise the use of the old approach of referencing views using the famous <b>findViewById() method</b>.
</p>

## Approach steps
<b>Step 1 Add the below configuration in the gradle.build module -> android tag </b><br /><br />
![Screenshot (279)](https://github.com/NdaedzoPhoshoko/DataBinding-ViewBinding/assets/121657564/8fe8f10f-0c1b-41d7-a62a-d1d8b48de4cc)

<b>Step 2 Design your UI layout file, assuming takes the name activity_main.xml, include the root element into the layout element, for data binding also include the data element with the variable name and type,
the type refers to the class the raw data belongs to (model), see below </b><br /><br />
![pic2](https://github.com/NdaedzoPhoshoko/DataBinding-ViewBinding/assets/121657564/21f76393-25dd-4261-908a-63c7672f77b7)

<b>Step 3 Now the system auto-generates a binding class corresponding to the name of your UI layout file. Mine is ActivityMainBinding, so in MainActivity.java, I'll declare the instance of this ActivityMainBinding class. Then we need to 
connect the inflated layout and the binding utility from this activity</b><br /><br />
![pic4](https://github.com/NdaedzoPhoshoko/DataBinding-ViewBinding/assets/121657564/56fcb193-e3f4-4c8d-a532-c58133621911)

<b>Step 4 We are done, we just use the binding instance to help us access all the data and views without using the ID or any help of <b>findViewById()</b> <br /><br />

<p>Make sure that you follow me on Linkedin.com, here <a href="https://www.linkedin.com/in/PhoshokoNdaedzo">Ndaedzo Phoshoko</a> (FullStack Developer path).
<b />
<b>Note</b> Views will not be onbind if you do not give them IDs, so take note of this whenever you perform binding for your data with views.
</p>

## See my example below 
![ViewBindingAndDataBinding-ezgif com-video-to-gif-converter](https://github.com/NdaedzoPhoshoko/DataBinding-ViewBinding/assets/121657564/a4251fcb-7832-4794-9af2-a63b07c7a247)




