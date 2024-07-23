SimpleActor   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleActor"; } } catch(err) { } //--> var methods = {"i0":6,"i1":18,"i2":18,"i3":18}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],4:\["t3","Abstract Methods"\],16:\["t5","Default Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleActor.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces")
*   [Next Class](../../../simple/hooks/interfaces/SimpleIdentifiable.html "interface in simple.hooks.interfaces")

*   [Frames](../../../index.html?simple/hooks/interfaces/SimpleActor.html)
*   [No Frames](SimpleActor.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   Field | 
*   Constr | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   Constr | 
*   [Method](#method.detail)

simple.hooks.interfaces

Interface SimpleActor
---------------------

*   All Superinterfaces:
    
    [SimpleActionable](../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces"), [SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces"), [SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces")
    
    All Known Implementing Classes:
    
    [SimpleLocalPlayer](../../../simple/hooks/wrappers/SimpleLocalPlayer.html "class in simple.hooks.wrappers"), [SimpleNpc](../../../simple/hooks/wrappers/SimpleNpc.html "class in simple.hooks.wrappers"), [SimplePlayer](../../../simple/hooks/wrappers/SimplePlayer.html "class in simple.hooks.wrappers")
    
    * * *
    
      
    
    public interface SimpleActor
    extends [SimpleActionable](../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces"), [SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces"), [SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces")
    
    Created by Seth on Nov 4, 2019 at 6:40:44 PM.
    
    Author:
    
    Seth Davis
    

*   *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Abstract Methods](javascript:show\(4\);) [Default Methods](javascript:show\(16\);) 
        
        Modifier and Type
        
        Method and Description
        
        `net.runelite.api.Actor`
        
        `[getActor](../../../simple/hooks/interfaces/SimpleActor.html#getActor--)()` 
        
        `default int`
        
        `[getAnimation](../../../simple/hooks/interfaces/SimpleActor.html#getAnimation--)()` 
        
        `default net.runelite.api.Actor`
        
        `[getInteracting](../../../simple/hooks/interfaces/SimpleActor.html#getInteracting--)()` 
        
        `default boolean`
        
        `[isAnimating](../../../simple/hooks/interfaces/SimpleActor.html#isAnimating--)()` 
        
        *   ### Methods inherited from interface simple.hooks.interfaces.[SimpleActionable](../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces")
            
            `[getActions](../../../simple/hooks/interfaces/SimpleActionable.html#getActions--)`
        
        *   ### Methods inherited from interface simple.hooks.interfaces.[SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")
            
            `[clickOnMinimap](../../../simple/hooks/interfaces/SimpleLocatable.html#clickOnMinimap--), [distanceTo](../../../simple/hooks/interfaces/SimpleLocatable.html#distanceTo-simple.hooks.interfaces.SimpleLocatable-), [getLocation](../../../simple/hooks/interfaces/SimpleLocatable.html#getLocation--), [within](../../../simple/hooks/interfaces/SimpleLocatable.html#within-simple.robot.utils.WorldArea-), [withinRange](../../../simple/hooks/interfaces/SimpleLocatable.html#withinRange-simple.hooks.interfaces.SimpleLocatable-int-)`
        
        *   ### Methods inherited from interface simple.hooks.interfaces.[SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces")
            
            `[getName](../../../simple/hooks/interfaces/SimpleNamable.html#getName--)`

*   *   ### Method Detail
        
        *   #### getActor
            
            net.runelite.api.Actor getActor()
            
        
        *   #### getInteracting
            
            default net.runelite.api.Actor getInteracting()
            
        
        *   #### getAnimation
            
            default int getAnimation()
            
        
        *   #### isAnimating
            
            default boolean isAnimating()
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleActor.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces")
*   [Next Class](../../../simple/hooks/interfaces/SimpleIdentifiable.html "interface in simple.hooks.interfaces")

*   [Frames](../../../index.html?simple/hooks/interfaces/SimpleActor.html)
*   [No Frames](SimpleActor.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Nested | 
*   Field | 
*   Constr | 
*   [Method](#method.summary)

*   Detail: 
*   Field | 
*   Constr | 
*   [Method](#method.detail)