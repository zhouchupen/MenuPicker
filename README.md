# MenuPicker

Android仿iOS弹出菜单

![](http://upload-images.jianshu.io/upload_images/2746415-7a1821a74dd85172.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



## Installing

Users of your library will need add the jitpack.io repository:

```gradle
allprojects {
 repositories {
    jcenter()
    maven { url "https://jitpack.io" }
 }
}
```

and:

```gradle
dependencies {
    compile 'com.github.zhouchupen:MenuPicker:v1.0'
}
```

Note: do not add the jitpack.io repository under `buildscript` 

## Adding a sample app 

If you add a sample app to the same repo then your app needs to depend on the library. To do this in your app/build.gradle add a dependency in the form:

```gradle
dependencies {
    compile project(':library')
}
```

where 'library' is the name of your library module.

## Using

You may need this to use the menu picker.  Firstly, you are supposed to define your menu picker:
```java
private class GenderPicker extends MenuPicker {

       @Override
       public void execute() {

            // TODO something when you select one item
            //this.getSelect());
            this.dismiss();
       }
}
```
Secondly, just to initalize your items:
```java
List<String> items = new ArrayList<>();
items.add("Hello Java");
items.add("Hello Android");
items.add("Hello Every");
```
And then show it:
```java
button.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {

            new GenderPicker().show(MainActivity.this, items);
       }
});
```
