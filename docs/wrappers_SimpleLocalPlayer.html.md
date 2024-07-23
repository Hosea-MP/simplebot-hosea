SimpleLocalPlayer   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleLocalPlayer"; } } catch(err) { } //--> var methods = {"i0":10,"i1":42,"i2":10,"i3":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\],32:\["t6","Deprecated Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleLocalPlayer.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers")
*   [Next Class](../../../simple/hooks/wrappers/SimpleNpc.html "class in simple.hooks.wrappers")

*   [Frames](../../../index.html?simple/hooks/wrappers/SimpleLocalPlayer.html)
*   [No Frames](SimpleLocalPlayer.html)

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

simple.hooks.wrappers

Class SimpleLocalPlayer
-----------------------

*   java.lang.Object
*   *   [simple.hooks.wrappers.Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")
    *   *   [simple.hooks.wrappers.SimplePlayer](../../../simple/hooks/wrappers/SimplePlayer.html "class in simple.hooks.wrappers")
        *   *   simple.hooks.wrappers.SimpleLocalPlayer

*   All Implemented Interfaces:
    
    [SimpleActionable](../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces"), [SimpleActor](../../../simple/hooks/interfaces/SimpleActor.html "interface in simple.hooks.interfaces"), [SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces"), [SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces")
    
    * * *
    
      
    
    public class SimpleLocalPlayer
    extends [SimplePlayer](../../../simple/hooks/wrappers/SimplePlayer.html "class in simple.hooks.wrappers")
    
    Author:
    
    Seth Davis
    

*   *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[SimpleLocalPlayer](../../../simple/hooks/wrappers/SimpleLocalPlayer.html#SimpleLocalPlayer-net.runelite.api.Client-)(net.runelite.api.Client c)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) [Deprecated Methods](javascript:show\(32\);) 
        
        Modifier and Type
        
        Method and Description
        
        `int`
        
        `[getHealth](../../../simple/hooks/wrappers/SimpleLocalPlayer.html#getHealth--)()` 
        
        `boolean`
        
        `[inMotion](../../../simple/hooks/wrappers/SimpleLocalPlayer.html#inMotion--)()`
        
        Deprecated. 
        
        `boolean`
        
        `[validateInteractable](../../../simple/hooks/wrappers/SimpleLocalPlayer.html#validateInteractable--)()` 
        
        `boolean`
        
        `[visibleOnScreen](../../../simple/hooks/wrappers/SimpleLocalPlayer.html#visibleOnScreen--)()`
        
        We shouldn't really be using/trying to interact with our local player So lets not try to run the methods.
        
        *   ### Methods inherited from class simple.hooks.wrappers.[SimplePlayer](../../../simple/hooks/wrappers/SimplePlayer.html "class in simple.hooks.wrappers")
            
            `[click](../../../simple/hooks/wrappers/SimplePlayer.html#click-java.lang.String-), [click](../../../simple/hooks/wrappers/SimplePlayer.html#click-java.lang.String-java.lang.String-), [getActions](../../../simple/hooks/wrappers/SimplePlayer.html#getActions--), [getActor](../../../simple/hooks/wrappers/SimplePlayer.html#getActor--), [getAnimation](../../../simple/hooks/wrappers/SimplePlayer.html#getAnimation--), [getClickBounds](../../../simple/hooks/wrappers/SimplePlayer.html#getClickBounds--), [getCombatLevel](../../../simple/hooks/wrappers/SimplePlayer.html#getCombatLevel--), [getGraphic](../../../simple/hooks/wrappers/SimplePlayer.html#getGraphic--), [getHealthRatio](../../../simple/hooks/wrappers/SimplePlayer.html#getHealthRatio--), [getInteracting](../../../simple/hooks/wrappers/SimplePlayer.html#getInteracting--), [getLocation](../../../simple/hooks/wrappers/SimplePlayer.html#getLocation--), [getName](../../../simple/hooks/wrappers/SimplePlayer.html#getName--), [getOverHeadIcon](../../../simple/hooks/wrappers/SimplePlayer.html#getOverHeadIcon--), [getOverheadText](../../../simple/hooks/wrappers/SimplePlayer.html#getOverheadText--), [getPlayer](../../../simple/hooks/wrappers/SimplePlayer.html#getPlayer--), [getPlayerDefinitions](../../../simple/hooks/wrappers/SimplePlayer.html#getPlayerDefinitions--), [getSkullIcon](../../../simple/hooks/wrappers/SimplePlayer.html#getSkullIcon--), [getTeam](../../../simple/hooks/wrappers/SimplePlayer.html#getTeam--), [inCombat](../../../simple/hooks/wrappers/SimplePlayer.html#inCombat--), [isAnimating](../../../simple/hooks/wrappers/SimplePlayer.html#isAnimating--), [useItemOnPlayer](../../../simple/hooks/wrappers/SimplePlayer.html#useItemOnPlayer-simple.hooks.wrappers.SimpleItem-)`
        
        *   ### Methods inherited from class simple.hooks.wrappers.[Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")
            
            `[click](../../../simple/hooks/wrappers/Clickable.html#click-int-), [clickOnMinimap](../../../simple/hooks/wrappers/Clickable.html#clickOnMinimap--), [getPointForType](../../../simple/hooks/wrappers/Clickable.html#getPointForType--), [turnTo](../../../simple/hooks/wrappers/Clickable.html#turnTo--)`
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface simple.hooks.interfaces.[SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")
            
            `[clickOnMinimap](../../../simple/hooks/interfaces/SimpleLocatable.html#clickOnMinimap--), [distanceTo](../../../simple/hooks/interfaces/SimpleLocatable.html#distanceTo-simple.hooks.interfaces.SimpleLocatable-), [within](../../../simple/hooks/interfaces/SimpleLocatable.html#within-simple.robot.utils.WorldArea-), [withinRange](../../../simple/hooks/interfaces/SimpleLocatable.html#withinRange-simple.hooks.interfaces.SimpleLocatable-int-)`

*   *   ### Constructor Detail
        
        *   #### SimpleLocalPlayer
            
            public SimpleLocalPlayer(net.runelite.api.Client c)
            
    
    *   ### Method Detail
        
        *   #### getHealth
            
            public int getHealth()
            
            Overrides:
            
            `[getHealth](../../../simple/hooks/wrappers/SimplePlayer.html#getHealth--)` in class `[SimplePlayer](../../../simple/hooks/wrappers/SimplePlayer.html "class in simple.hooks.wrappers")`
            
        
        *   #### visibleOnScreen
            
            public boolean visibleOnScreen()
            
            We shouldn't really be using/trying to interact with our local player So lets not try to run the methods.
            
            Overrides:
            
            `[visibleOnScreen](../../../simple/hooks/wrappers/Clickable.html#visibleOnScreen--)` in class `[Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")`
            
        
        *   #### validateInteractable
            
            public boolean validateInteractable()
            
            Overrides:
            
            `[validateInteractable](../../../simple/hooks/wrappers/Clickable.html#validateInteractable--)` in class `[Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")`
            
        
        *   #### inMotion
            
            @Deprecated
            public boolean inMotion()
            
            Deprecated. 
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleLocalPlayer.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/wrappers/SimpleItem.ItemType.html "enum in simple.hooks.wrappers")
*   [Next Class](../../../simple/hooks/wrappers/SimpleNpc.html "class in simple.hooks.wrappers")

*   [Frames](../../../index.html?simple/hooks/wrappers/SimpleLocalPlayer.html)
*   [No Frames](SimpleLocalPlayer.html)

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