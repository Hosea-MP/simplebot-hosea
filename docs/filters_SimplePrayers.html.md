SimplePrayers   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimplePrayers"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10,"i6":10,"i7":10,"i8":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimplePrayers.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/filters/SimplePlayers.html "class in simple.hooks.filters")
*   [Next Class](../../../simple/hooks/filters/SimplePrayers.Prayers.html "enum in simple.hooks.filters")

*   [Frames](../../../index.html?simple/hooks/filters/SimplePrayers.html)
*   [No Frames](SimplePrayers.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   [Nested](#nested.class.summary) | 
*   Field | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)

simple.hooks.filters

Class SimplePrayers
-------------------

*   java.lang.Object
*   *   simple.hooks.filters.SimplePrayers

*   * * *
    
      
    
    public class SimplePrayers
    extends java.lang.Object
    
    Author:
    
    Seth Davis
    

*   *   ### Nested Class Summary
        
        Nested Classes 
        
        Modifier and Type
        
        Class and Description
        
        `static class` 
        
        `[SimplePrayers.Prayers](../../../simple/hooks/filters/SimplePrayers.Prayers.html "enum in simple.hooks.filters")` 
        
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[SimplePrayers](../../../simple/hooks/filters/SimplePrayers.html#SimplePrayers-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `int`
        
        `[maxPoints](../../../simple/hooks/filters/SimplePrayers.html#maxPoints--)()`
        
        will return your max prayer points based on your level
        
        `int`
        
        `[points](../../../simple/hooks/filters/SimplePrayers.html#points--)()`
        
        returns your current prayer points
        
        `boolean`
        
        `[prayer](../../../simple/hooks/filters/SimplePrayers.html#prayer-simple.hooks.filters.SimplePrayers.Prayers-)([SimplePrayers.Prayers](../../../simple/hooks/filters/SimplePrayers.Prayers.html "enum in simple.hooks.filters") prayer)`
        
        will toggle specified {prayer} ON
        
        `boolean`
        
        `[prayer](../../../simple/hooks/filters/SimplePrayers.html#prayer-simple.hooks.filters.SimplePrayers.Prayers-boolean-)([SimplePrayers.Prayers](../../../simple/hooks/filters/SimplePrayers.Prayers.html "enum in simple.hooks.filters") prayer, boolean toggle)`
        
        will toggle specified {prayed} to {toggle}(on or off), returns {true} if state is = to {toggle} otherwise {false} (sleeps 150ms \* 20 times)
        
        `boolean`
        
        `[prayer](../../../simple/hooks/filters/SimplePrayers.html#prayer-simple.hooks.filters.SimplePrayers.Prayers-boolean-boolean-)([SimplePrayers.Prayers](../../../simple/hooks/filters/SimplePrayers.Prayers.html "enum in simple.hooks.filters") prayer, boolean toggle, boolean waitTillToggled)`
        
        will toggle specified {prayed} to {toggle}(on or off), returns {true} if state is = to {toggle} otherwise {false} (sleeps 150ms \* 20 times)
        
        `boolean`
        
        `[prayerActive](../../../simple/hooks/filters/SimplePrayers.html#prayerActive-simple.hooks.filters.SimplePrayers.Prayers-)([SimplePrayers.Prayers](../../../simple/hooks/filters/SimplePrayers.Prayers.html "enum in simple.hooks.filters") prayer)`
        
        returns if you current have {prayer} active, {true} = prayer is active, {false} = prayer not active
        
        `int`
        
        `[prayerPercent](../../../simple/hooks/filters/SimplePrayers.html#prayerPercent--)()`
        
        will return your current prayer based on a percentage out of {100}
        
        `boolean`
        
        `[quickPrayers](../../../simple/hooks/filters/SimplePrayers.html#quickPrayers--)()`
        
        returns {true} if quick prayer is currently toggled, {false} if quick prayer is not currently toggled
        
        `boolean`
        
        `[quickPrayers](../../../simple/hooks/filters/SimplePrayers.html#quickPrayers-boolean-)(boolean toggle)`
        
        will toggle quick prayer to value of {toggle}, either ON or OFF dependent on {toggle}, will return if {current quick prayer state} = {toggle}
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Constructor Detail
        
        *   #### SimplePrayers
            
            public SimplePrayers([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)
            
    
    *   ### Method Detail
        
        *   #### prayer
            
            public boolean prayer([SimplePrayers.Prayers](../../../simple/hooks/filters/SimplePrayers.Prayers.html "enum in simple.hooks.filters") prayer)
            
            will toggle specified {prayer} ON
            
            Parameters:
            
            `prayer` -
            
            Returns:
            
            \- if the specified prayer ha sbeen toggled on
            
        
        *   #### prayer
            
            public boolean prayer([SimplePrayers.Prayers](../../../simple/hooks/filters/SimplePrayers.Prayers.html "enum in simple.hooks.filters") prayer,
                                  boolean toggle)
            
            will toggle specified {prayed} to {toggle}(on or off), returns {true} if state is = to {toggle} otherwise {false} (sleeps 150ms \* 20 times)
            
            Parameters:
            
            `prayer` -
            
            `toggle` -
            
            Returns:
            
        
        *   #### prayer
            
            public boolean prayer([SimplePrayers.Prayers](../../../simple/hooks/filters/SimplePrayers.Prayers.html "enum in simple.hooks.filters") prayer,
                                  boolean toggle,
                                  boolean waitTillToggled)
            
            will toggle specified {prayed} to {toggle}(on or off), returns {true} if state is = to {toggle} otherwise {false} (sleeps 150ms \* 20 times)
            
            Parameters:
            
            `prayer` -
            
            `toggle` -
            
            `waitTillToggled` - - if {false} the script will not sleep to confirm the prayer has actually been enabled, {true} will sleep
            
            Returns:
            
        
        *   #### prayerActive
            
            public boolean prayerActive([SimplePrayers.Prayers](../../../simple/hooks/filters/SimplePrayers.Prayers.html "enum in simple.hooks.filters") prayer)
            
            returns if you current have {prayer} active, {true} = prayer is active, {false} = prayer not active
            
            Parameters:
            
            `prayer` -
            
            Returns:
            
        
        *   #### points
            
            public int points()
            
            returns your current prayer points
            
            Returns:
            
        
        *   #### maxPoints
            
            public int maxPoints()
            
            will return your max prayer points based on your level
            
            Returns:
            
        
        *   #### prayerPercent
            
            public int prayerPercent()
            
            will return your current prayer based on a percentage out of {100}
            
            Returns:
            
        
        *   #### quickPrayers
            
            public boolean quickPrayers()
            
            returns {true} if quick prayer is currently toggled, {false} if quick prayer is not currently toggled
            
            Returns:
            
        
        *   #### quickPrayers
            
            public boolean quickPrayers(boolean toggle)
            
            will toggle quick prayer to value of {toggle}, either ON or OFF dependent on {toggle}, will return if {current quick prayer state} = {toggle}
            
            Parameters:
            
            `toggle` -
            
            Returns:
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimplePrayers.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/filters/SimplePlayers.html "class in simple.hooks.filters")
*   [Next Class](../../../simple/hooks/filters/SimplePrayers.Prayers.html "enum in simple.hooks.filters")

*   [Frames](../../../index.html?simple/hooks/filters/SimplePrayers.html)
*   [No Frames](SimplePrayers.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   [Nested](#nested.class.summary) | 
*   Field | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)