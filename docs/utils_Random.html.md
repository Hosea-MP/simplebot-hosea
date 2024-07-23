Random   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Random"; } } catch(err) { } //--> var methods = {"i0":9,"i1":9,"i2":9,"i3":9,"i4":9,"i5":9,"i6":9,"i7":9,"i8":9,"i9":9,"i10":9}; var tabs = {65535:\["t0","All Methods"\],1:\["t1","Static Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Random.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/robot/utils/Debug.html "class in simple.robot.utils")
*   [Next Class](../../../simple/robot/utils/ScriptUtils.html "class in simple.robot.utils")

*   [Frames](../../../index.html?simple/robot/utils/Random.html)
*   [No Frames](Random.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   Field | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)

simple.robot.utils

Class Random
------------

*   java.lang.Object
*   *   simple.robot.utils.Random

*   * * *
    
      
    
    public class Random
    extends java.lang.Object
    
    A random class is used for generating random numbers
    
    Author:
    
    Everel
    

*   *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[Random](../../../simple/robot/utils/Random.html#Random--)()` 
        
    
    *   ### Method Summary
        
        All Methods [Static Methods](javascript:show\(1\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `static int`
        
        `[between](../../../simple/robot/utils/Random.html#between-int-int-)(int min, int max)`
        
        Randomizes a number between minimum and maximum
        
        `static boolean`
        
        `[containsId](../../../simple/robot/utils/Random.html#containsId-int-int...-)(int id, int... ids)` 
        
        `static boolean`
        
        `[containsString](../../../simple/robot/utils/Random.html#containsString-java.lang.String-java.lang.String...-)(java.lang.String str, java.lang.String... strs)` 
        
        `static net.runelite.api.Point`
        
        `[getRandomClickPoint](../../../simple/robot/utils/Random.html#getRandomClickPoint-int-int-int-int-)(int widgetX, int widgetY, int widgetWidth, int widgetHeight)` 
        
        `static net.runelite.api.Point`
        
        `[getRandomClickPoint](../../../simple/robot/utils/Random.html#getRandomClickPoint-int-int-int-int-int-)(int widgetX, int widgetY, int widgetWidth, int widgetHeight, int closeGap)` 
        
        `static net.runelite.api.Point`
        
        `[getRandomClickPoint](../../../simple/robot/utils/Random.html#getRandomClickPoint-int-int-int-int-int-boolean-)(int widgetX, int widgetY, int widgetWidth, int widgetHeight, int closeGap, boolean convex)` 
        
        `static net.runelite.api.Point`
        
        `[getRandomClickPoint](../../../simple/robot/utils/Random.html#getRandomClickPoint-java.awt.geom.Rectangle2D-)(java.awt.geom.Rectangle2D shape)` 
        
        `static boolean`
        
        `[isNumeric](../../../simple/robot/utils/Random.html#isNumeric-java.lang.String-)(java.lang.String str)` 
        
        `static int`
        
        `[nextInt](../../../simple/robot/utils/Random.html#nextInt-int-)(int max)` 
        
        `static int`
        
        `[nextInt](../../../simple/robot/utils/Random.html#nextInt-int-int-)(int min, int max)` 
        
        `static int`
        
        `[random](../../../simple/robot/utils/Random.html#random-int-int-int-)(int min, int max, int sd)` 
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Constructor Detail
        
        *   #### Random
            
            public Random()
            
    
    *   ### Method Detail
        
        *   #### getRandomClickPoint
            
            public static net.runelite.api.Point getRandomClickPoint(java.awt.geom.Rectangle2D shape)
            
        
        *   #### getRandomClickPoint
            
            public static net.runelite.api.Point getRandomClickPoint(int widgetX,
                                                                     int widgetY,
                                                                     int widgetWidth,
                                                                     int widgetHeight)
            
        
        *   #### getRandomClickPoint
            
            public static net.runelite.api.Point getRandomClickPoint(int widgetX,
                                                                     int widgetY,
                                                                     int widgetWidth,
                                                                     int widgetHeight,
                                                                     int closeGap)
            
        
        *   #### getRandomClickPoint
            
            public static net.runelite.api.Point getRandomClickPoint(int widgetX,
                                                                     int widgetY,
                                                                     int widgetWidth,
                                                                     int widgetHeight,
                                                                     int closeGap,
                                                                     boolean convex)
            
        
        *   #### between
            
            public static int between(int min,
                                      int max)
            
            Randomizes a number between minimum and maximum
            
            Parameters:
            
            `min` -
            
            `max` -
            
            Returns:
            
            randomized number
            
        
        *   #### containsString
            
            public static boolean containsString(java.lang.String str,
                                                 java.lang.String... strs)
            
            Parameters:
            
            `str` -
            
            `strs` -
            
            Returns:
            
            \- if {strs\[\]} contains {str}
            
        
        *   #### containsId
            
            public static boolean containsId(int id,
                                             int... ids)
            
            Parameters:
            
            `id` -
            
            `ids` -
            
            Returns:
            
            \- if {ids\[\]} cotains {id}
            
        
        *   #### nextInt
            
            public static int nextInt(int max)
            
        
        *   #### nextInt
            
            public static int nextInt(int min,
                                      int max)
            
        
        *   #### random
            
            public static int random(int min,
                                     int max,
                                     int sd)
            
        
        *   #### isNumeric
            
            public static boolean isNumeric(java.lang.String str)
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Random.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/robot/utils/Debug.html "class in simple.robot.utils")
*   [Next Class](../../../simple/robot/utils/ScriptUtils.html "class in simple.robot.utils")

*   [Frames](../../../index.html?simple/robot/utils/Random.html)
*   [No Frames](Random.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   Field | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)