# RangeSeekBar

##Introduction
RangeSeekbar as name suggests gives you a seekbar with two thumb for minimum and maximum value.
That's it.

###Features
Library provide 4 simple attributes in XML file :

1. **background_color**   : Define color for background.
2. **bar_color**          : Define color for default bar.
3. **selected_bar_color** : Define color for the range bar connecting two thumbs.
4. **bar_height**         : Give bar height.
5. **thumb_image**        : Set image for thumb both min-thumb  and max-thumb. 
6. **thumb_image_max**    : Set image for max-thumb different from min thumb.

###Instructions 

1. Download or clone this repo.
2. Import *Segment* library in your IDE.
3. Right click on your **project** >>> select **Properties** >>> **Android** >>> inside Library section >>> click **Add** >>> and select **Segment**.
4. Once *Segment* library is added you can start coding.

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

###Screenshots

![](https://cloud.githubusercontent.com/assets/4836122/8495398/057f39ae-218b-11e5-844d-923a2655f6df.png)
