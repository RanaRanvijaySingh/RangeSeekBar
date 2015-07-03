# RangeSeekBar

##Introduction
RangeSeekbar as name suggests gives you range between two thumb position ie. minimum and maximum value.
That's it.

###Screenshots

![](https://cloud.githubusercontent.com/assets/4836122/8495398/057f39ae-218b-11e5-844d-923a2655f6df.png)


![](https://cloud.githubusercontent.com/assets/4836122/8495752/96369dd2-218d-11e5-8bd6-a7cda0aa068f.png)


![](https://cloud.githubusercontent.com/assets/4836122/8495991/61d4dbce-218f-11e5-8fb1-2b85ad777e0b.png)

###Features
Library provide 6 simple attributes in XML file :

1. **background_color**   : Define color for background.
2. **bar_color**          : Define color for default bar.
3. **selected_bar_color** : Define color for the range bar connecting two thumbs.
4. **bar_height**         : Give bar height.
5. **thumb_image**        : Set image for thumb both min-thumb  and max-thumb. 
6. **thumb_image_max**    : Set image for max-thumb different from min thumb.

###Sample
In your xml file you need to add `xmlns:custom="http://schemas.android.com/apk/res-auto"` with parent layout.  
```
       <com.rana.rangeseekbar.RangeSeekbar
        android:id="@+id/rangeSeekBar"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        custom:bar_color="#88c14c"
        custom:bar_height="4dp"
        custom:background_color="#3c3f41"
        custom:selected_bar_color="#e77e2c"
        custom:thumb_image="@drawable/ic_slider"
        custom:thumb_image_max="@drawable/ic_slider"/>
```
Now to get the call back in your java code, you have `OnRangeChangeListener` interface.  
You need to implement this interface in your class.  
**OnRangeChangeListener** interface provides one function `setRangeChangeListener`.  
The Parameters are   
         * view - View object       : Individual button that you have clicked.  
         * minPosition - double     : Position of the min-thumb.  
         * maxPosition - double     : Position of the max-thumb.  

```

public class MainActivity extends Activity implements OnRangeChangeListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RangeSeekbar rangeSeekbar = (RangeSeekbar)findViewById(R.id.rangeSeekBar);
        rangeSeekbar.setOnRangeListener(this);
    }

    @Override
    public void setRangeChangeListener(View view, double minPosition, double maxPosition) {
      //view - lets you access whole custom view for RangeSeekBar
      //minPosition - gives values us to 2 decimal position for better accuracy. eg. 12.13
      //maxPosition - goes the same as minPosition
    }
}
```

### Version
1.0
