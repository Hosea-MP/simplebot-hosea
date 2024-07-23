Varpbits   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Varpbits"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Varpbits.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/Trade.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/Viewport.html "class in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Varpbits.html)
*   [No Frames](Varpbits.html)

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

simple.hooks.simplebot

Class Varpbits
--------------

*   java.lang.Object
*   *   simple.hooks.simplebot.Varpbits

*   * * *
    
      
    
    public class Varpbits
    extends java.lang.Object
    
    Created by Seth on Nov 18, 2019 at 9:29:50 PM.
    
    Author:
    
    Seth Davis
    

*   *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[Varpbits](../../../simple/hooks/simplebot/Varpbits.html#Varpbits-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") client)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `int[]`
        
        `[array](../../../simple/hooks/simplebot/Varpbits.html#array--)()`
        
        will return the array of varpbits a.k.a settings
        
        `int`
        
        `[varpbit](../../../simple/hooks/simplebot/Varpbits.html#varpbit-int-)(int index)`
        
        will return the setting for the specified index
        
        `int`
        
        `[varpbit](../../../simple/hooks/simplebot/Varpbits.html#varpbit-int-int-)(int index, int mask)`
        
        will return the setting for the specified index with {mask} applied to it
        
        `int`
        
        `[varpbit](../../../simple/hooks/simplebot/Varpbits.html#varpbit-int-int-int-)(int index, int shift, int mask)`
        
        will return the setting for the specified index shifted by {shift} with {mask} applied to it
        
        `int`
        
        `[varpbit](../../../simple/hooks/simplebot/Varpbits.html#varpbit-net.runelite.api.Varbits-)(net.runelite.api.Varbits varbits)` 
        
        `int`
        
        `[varpbit](../../../simple/hooks/simplebot/Varpbits.html#varpbit-net.runelite.api.VarPlayer-)(net.runelite.api.VarPlayer varPlayer)` 
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Constructor Detail
        
        *   #### Varpbits
            
            public Varpbits([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") client)
            
    
    *   ### Method Detail
        
        *   #### array
            
            public int\[\] array()
            
            will return the array of varpbits a.k.a settings
            
            Returns:
            
        
        *   #### varpbit
            
            public int varpbit(int index)
            
            will return the setting for the specified index
            
            Parameters:
            
            `index` -
            
            Returns:
            
        
        *   #### varpbit
            
            public int varpbit(int index,
                               int mask)
            
            will return the setting for the specified index with {mask} applied to it
            
            Parameters:
            
            `index` -
            
            `mask` -
            
            Returns:
            
        
        *   #### varpbit
            
            public int varpbit(int index,
                               int shift,
                               int mask)
            
            will return the setting for the specified index shifted by {shift} with {mask} applied to it
            
            Parameters:
            
            `index` -
            
            `shift` -
            
            `mask` -
            
            Returns:
            
        
        *   #### varpbit
            
            public int varpbit(net.runelite.api.Varbits varbits)
            
        
        *   #### varpbit
            
            public int varpbit(net.runelite.api.VarPlayer varPlayer)
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Varpbits.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/Trade.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/Viewport.html "class in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Varpbits.html)
*   [No Frames](Varpbits.html)

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