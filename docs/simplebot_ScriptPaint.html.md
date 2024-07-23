ScriptPaint   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="ScriptPaint"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/ScriptPaint.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/Projectiles.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/Trade.html "class in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/ScriptPaint.html)
*   [No Frames](ScriptPaint.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   [Field](#field.summary) | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   [Field](#field.detail) | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)

simple.hooks.simplebot

Class ScriptPaint
-----------------

*   java.lang.Object
*   *   simple.hooks.simplebot.ScriptPaint

*   * * *
    
      
    
    public class ScriptPaint
    extends java.lang.Object
    
    Created by Seth on December 12/22/2019, 2019 at 12:58 AM
    
    Author:
    
    Seth Davis
    

*   *   ### Field Summary
        
        Fields 
        
        Modifier and Type
        
        Field and Description
        
        `static int`
        
        `[MAX_DRAW_DISTANCE](../../../simple/hooks/simplebot/ScriptPaint.html#MAX_DRAW_DISTANCE)` 
        
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[ScriptPaint](../../../simple/hooks/simplebot/ScriptPaint.html#ScriptPaint-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        `[drawNpcMatrix](../../../simple/hooks/simplebot/ScriptPaint.html#drawNpcMatrix-java.awt.Graphics2D-simple.hooks.wrappers.SimpleNpc-)(java.awt.Graphics2D graphics2D, [SimpleNpc](../../../simple/hooks/wrappers/SimpleNpc.html "class in simple.hooks.wrappers") simpleNpc)`
        
        Draws a specified simplenpc's click bounds in-game
        
        `boolean`
        
        `[drawObjectMatrix](../../../simple/hooks/simplebot/ScriptPaint.html#drawObjectMatrix-java.awt.Graphics2D-simple.hooks.wrappers.SimpleObject-)(java.awt.Graphics2D graphics2D, [SimpleObject](../../../simple/hooks/wrappers/SimpleObject.html "class in simple.hooks.wrappers") simpleObject)`
        
        Draws a specified simplenpc's click bounds in-game
        
        `boolean`
        
        `[drawTileMatrix](../../../simple/hooks/simplebot/ScriptPaint.html#drawTileMatrix-java.awt.Graphics2D-net.runelite.api.coords.WorldPoint-java.awt.Color-)(java.awt.Graphics2D graphics2D, net.runelite.api.coords.WorldPoint point, java.awt.Color color)`
        
        Draws a specified world point's bounds in game
        
        `java.lang.String`
        
        `[formatTime](../../../simple/hooks/simplebot/ScriptPaint.html#formatTime-long-)(long timeInMillis)`
        
        Will return a formatted string of time given a number in milliseconds
        
        `java.awt.image.BufferedImage`
        
        `[getImage](../../../simple/hooks/simplebot/ScriptPaint.html#getImage-java.lang.String-)(java.lang.String url)`
        
        Retrieves an image from the given website {url}, caches the image for you so you don't have to
        
        `int`
        
        `[valuePerHour](../../../simple/hooks/simplebot/ScriptPaint.html#valuePerHour-int-long-)(int value, long startTime)`
        
        Will return the hourly rate of the specified {value}
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Field Detail
        
        *   #### MAX\_DRAW\_DISTANCE
            
            public static final int MAX\_DRAW\_DISTANCE
            
            See Also:
            
            [Constant Field Values](../../../constant-values.html#simple.hooks.simplebot.ScriptPaint.MAX_DRAW_DISTANCE)
            
    
    *   ### Constructor Detail
        
        *   #### ScriptPaint
            
            public ScriptPaint([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)
            
    
    *   ### Method Detail
        
        *   #### formatTime
            
            public java.lang.String formatTime(long timeInMillis)
            
            Will return a formatted string of time given a number in milliseconds
            
            Parameters:
            
            `timeInMillis` - the number of milliseconds to format usually will be {System.currentTimeMillis() - startTime}
            
            Returns:
            
            returns a formatted time string e.g. {00:02:32}
            
        
        *   #### valuePerHour
            
            public int valuePerHour(int value,
                                    long startTime)
            
            Will return the hourly rate of the specified {value}
            
            Parameters:
            
            `value` - value to get hourly rate of
            
            `startTime` - the starting time for this calculation
            
            Returns:
            
            returns the hourly rate a value is being produced using the time of which it has begun
            
        
        *   #### drawTileMatrix
            
            public boolean drawTileMatrix(java.awt.Graphics2D graphics2D,
                                          net.runelite.api.coords.WorldPoint point,
                                          java.awt.Color color)
            
            Draws a specified world point's bounds in game
            
            Parameters:
            
            `graphics2D` - the graphics object to use for painting the point
            
            `point` - the world point to draw
            
            `color` - the outline color of the world point
            
            Returns:
            
            returns {true} if the world point has been drawn
            
        
        *   #### drawNpcMatrix
            
            public boolean drawNpcMatrix(java.awt.Graphics2D graphics2D,
                                         [SimpleNpc](../../../simple/hooks/wrappers/SimpleNpc.html "class in simple.hooks.wrappers") simpleNpc)
            
            Draws a specified simplenpc's click bounds in-game
            
            Parameters:
            
            `graphics2D` - the graphics object to use for painting the point
            
            `simpleNpc` - the npc to draw
            
            Returns:
            
            returns {true} if the npc has been drawn
            
        
        *   #### drawObjectMatrix
            
            public boolean drawObjectMatrix(java.awt.Graphics2D graphics2D,
                                            [SimpleObject](../../../simple/hooks/wrappers/SimpleObject.html "class in simple.hooks.wrappers") simpleObject)
            
            Draws a specified simplenpc's click bounds in-game
            
            Parameters:
            
            `graphics2D` - the graphics object to use for painting the point
            
            `simpleObject` - the npc to draw
            
            Returns:
            
            returns {true} if the npc has been drawn
            
        
        *   #### getImage
            
            public java.awt.image.BufferedImage getImage(java.lang.String url)
            
            Retrieves an image from the given website {url}, caches the image for you so you don't have to
            
            Parameters:
            
            `url` - the url to grab the image from
            
            Returns:
            
            returns a buffered image representing the image from the given {url} to be used in paint
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/ScriptPaint.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/Projectiles.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/Trade.html "class in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/ScriptPaint.html)
*   [No Frames](ScriptPaint.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   [Field](#field.summary) | 
*   [Constr](#constructor.summary) | 
*   [Method](#method.summary)

*   Detail: 
*   [Field](#field.detail) | 
*   [Constr](#constructor.detail) | 
*   [Method](#method.detail)