SimpleObject   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleObject"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10,"i6":10,"i7":10,"i8":10,"i9":10,"i10":10,"i11":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleObject.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/wrappers/SimpleNpc.html "class in simple.hooks.wrappers")
*   [Next Class](../../../simple/hooks/wrappers/SimplePlayer.html "class in simple.hooks.wrappers")

*   [Frames](../../../index.html?simple/hooks/wrappers/SimpleObject.html)
*   [No Frames](SimpleObject.html)

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

Class SimpleObject
------------------

*   java.lang.Object
*   *   [simple.hooks.wrappers.Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")
    *   *   simple.hooks.wrappers.SimpleObject

*   All Implemented Interfaces:
    
    [SimpleActionable](../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces"), [SimpleIdentifiable](../../../simple/hooks/interfaces/SimpleIdentifiable.html "interface in simple.hooks.interfaces"), [SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces"), [SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces")
    
    * * *
    
      
    
    public class SimpleObject
    extends [Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")
    implements [SimpleActionable](../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces"), [SimpleIdentifiable](../../../simple/hooks/interfaces/SimpleIdentifiable.html "interface in simple.hooks.interfaces"), [SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces"), [SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")
    
    Author:
    
    Seth Davis
    

*   *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[SimpleObject](../../../simple/hooks/wrappers/SimpleObject.html#SimpleObject-net.runelite.api.TileObject-)(net.runelite.api.TileObject to)` 
        
        `[SimpleObject](../../../simple/hooks/wrappers/SimpleObject.html#SimpleObject-net.runelite.api.TileObject-int-)(net.runelite.api.TileObject to, int objectId)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        `[click](../../../simple/hooks/wrappers/SimpleObject.html#click-int-)(int option)` 
        
        `boolean`
        
        `[click](../../../simple/hooks/wrappers/SimpleObject.html#click-java.lang.String-)(java.lang.String action)`
        
        This makes mouse click with option
        
        `boolean`
        
        `[click](../../../simple/hooks/wrappers/SimpleObject.html#click-java.lang.String-java.lang.String-)(java.lang.String action, java.lang.String option)` 
        
        `java.lang.String[]`
        
        `[getActions](../../../simple/hooks/wrappers/SimpleObject.html#getActions--)()`
        
        Returns Actions of the object
        
        `java.awt.geom.Rectangle2D`
        
        `[getClickBounds](../../../simple/hooks/wrappers/SimpleObject.html#getClickBounds--)()` 
        
        `int`
        
        `[getId](../../../simple/hooks/wrappers/SimpleObject.html#getId--)()`
        
        Returns id of the object
        
        `net.runelite.api.coords.WorldPoint`
        
        `[getLocation](../../../simple/hooks/wrappers/SimpleObject.html#getLocation--)()`
        
        Position in world of object
        
        `java.lang.String`
        
        `[getName](../../../simple/hooks/wrappers/SimpleObject.html#getName--)()`
        
        The name of said object
        
        `net.runelite.api.ObjectComposition`
        
        `[getObjectDefinitions](../../../simple/hooks/wrappers/SimpleObject.html#getObjectDefinitions--)()` 
        
        `net.runelite.api.TileObject`
        
        `[getTileObject](../../../simple/hooks/wrappers/SimpleObject.html#getTileObject--)()` 
        
        `boolean`
        
        `[isImposter](../../../simple/hooks/wrappers/SimpleObject.html#isImposter--)()` 
        
        `boolean`
        
        `[visibleOnScreen](../../../simple/hooks/wrappers/SimpleObject.html#visibleOnScreen--)()` 
        
        *   ### Methods inherited from class simple.hooks.wrappers.[Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")
            
            `[clickOnMinimap](../../../simple/hooks/wrappers/Clickable.html#clickOnMinimap--), [getPointForType](../../../simple/hooks/wrappers/Clickable.html#getPointForType--), [turnTo](../../../simple/hooks/wrappers/Clickable.html#turnTo--), [validateInteractable](../../../simple/hooks/wrappers/Clickable.html#validateInteractable--)`
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface simple.hooks.interfaces.[SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")
            
            `[clickOnMinimap](../../../simple/hooks/interfaces/SimpleLocatable.html#clickOnMinimap--), [distanceTo](../../../simple/hooks/interfaces/SimpleLocatable.html#distanceTo-simple.hooks.interfaces.SimpleLocatable-), [within](../../../simple/hooks/interfaces/SimpleLocatable.html#within-simple.robot.utils.WorldArea-), [withinRange](../../../simple/hooks/interfaces/SimpleLocatable.html#withinRange-simple.hooks.interfaces.SimpleLocatable-int-)`

*   *   ### Constructor Detail
        
        *   #### SimpleObject
            
            public SimpleObject(net.runelite.api.TileObject to)
            
        
        *   #### SimpleObject
            
            public SimpleObject(net.runelite.api.TileObject to,
                                int objectId)
            
    
    *   ### Method Detail
        
        *   #### getName
            
            public java.lang.String getName()
            
            Description copied from interface: `[SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html#getName--)`
            
            The name of said object
            
            Specified by:
            
            `[getName](../../../simple/hooks/interfaces/SimpleNamable.html#getName--)` in interface `[SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces")`
            
            Returns:
            
            \- the name of this object
            
        
        *   #### getClickBounds
            
            public java.awt.geom.Rectangle2D getClickBounds()
            
        
        *   #### getId
            
            public int getId()
            
            Description copied from interface: `[SimpleIdentifiable](../../../simple/hooks/interfaces/SimpleIdentifiable.html#getId--)`
            
            Returns id of the object
            
            Specified by:
            
            `[getId](../../../simple/hooks/interfaces/SimpleIdentifiable.html#getId--)` in interface `[SimpleIdentifiable](../../../simple/hooks/interfaces/SimpleIdentifiable.html "interface in simple.hooks.interfaces")`
            
            Returns:
            
            \- id of said object
            
        
        *   #### getObjectDefinitions
            
            public net.runelite.api.ObjectComposition getObjectDefinitions()
            
        
        *   #### getTileObject
            
            public net.runelite.api.TileObject getTileObject()
            
        
        *   #### getLocation
            
            public net.runelite.api.coords.WorldPoint getLocation()
            
            Description copied from interface: `[SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html#getLocation--)`
            
            Position in world of object
            
            Specified by:
            
            `[getLocation](../../../simple/hooks/interfaces/SimpleLocatable.html#getLocation--)` in interface `[SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")`
            
            Returns:
            
            \- Worldpoint of the locatable wrapper
            
        
        *   #### getActions
            
            public java.lang.String\[\] getActions()
            
            Description copied from interface: `[SimpleActionable](../../../simple/hooks/interfaces/SimpleActionable.html#getActions--)`
            
            Returns Actions of the object
            
            Specified by:
            
            `[getActions](../../../simple/hooks/interfaces/SimpleActionable.html#getActions--)` in interface `[SimpleActionable](../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces")`
            
            Returns:
            
            \- actions array of said object
            
        
        *   #### isImposter
            
            public boolean isImposter()
            
        
        *   #### click
            
            public boolean click(java.lang.String action)
            
            Description copied from class: `[Clickable](../../../simple/hooks/wrappers/Clickable.html#click-java.lang.String-)`
            
            This makes mouse click with option
            
            Overrides:
            
            `[click](../../../simple/hooks/wrappers/Clickable.html#click-java.lang.String-)` in class `[Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")`
            
            Returns:
            
        
        *   #### click
            
            public boolean click(java.lang.String action,
                                 java.lang.String option)
            
            Overrides:
            
            `[click](../../../simple/hooks/wrappers/Clickable.html#click-java.lang.String-java.lang.String-)` in class `[Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")`
            
        
        *   #### click
            
            public boolean click(int option)
            
            Overrides:
            
            `[click](../../../simple/hooks/wrappers/Clickable.html#click-int-)` in class `[Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")`
            
        
        *   #### visibleOnScreen
            
            public boolean visibleOnScreen()
            
            Overrides:
            
            `[visibleOnScreen](../../../simple/hooks/wrappers/Clickable.html#visibleOnScreen--)` in class `[Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")`
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleObject.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/wrappers/SimpleNpc.html "class in simple.hooks.wrappers")
*   [Next Class](../../../simple/hooks/wrappers/SimplePlayer.html "class in simple.hooks.wrappers")

*   [Frames](../../../index.html?simple/hooks/wrappers/SimpleObject.html)
*   [No Frames](SimpleObject.html)

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