SimpleNpc   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleNpc"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10,"i6":10,"i7":42,"i8":10,"i9":10,"i10":10,"i11":10,"i12":10,"i13":10,"i14":10,"i15":10,"i16":10,"i17":10,"i18":10,"i19":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\],32:\["t6","Deprecated Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleNpc.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/wrappers/SimpleLocalPlayer.html "class in simple.hooks.wrappers")
*   [Next Class](../../../simple/hooks/wrappers/SimpleObject.html "class in simple.hooks.wrappers")

*   [Frames](../../../index.html?simple/hooks/wrappers/SimpleNpc.html)
*   [No Frames](SimpleNpc.html)

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

Class SimpleNpc
---------------

*   java.lang.Object
*   *   [simple.hooks.wrappers.Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")
    *   *   simple.hooks.wrappers.SimpleNpc

*   All Implemented Interfaces:
    
    [SimpleActionable](../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces"), [SimpleActor](../../../simple/hooks/interfaces/SimpleActor.html "interface in simple.hooks.interfaces"), [SimpleIdentifiable](../../../simple/hooks/interfaces/SimpleIdentifiable.html "interface in simple.hooks.interfaces"), [SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces"), [SimpleNamable](../../../simple/hooks/interfaces/SimpleNamable.html "interface in simple.hooks.interfaces")
    
    * * *
    
      
    
    public class SimpleNpc
    extends [Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")
    implements [SimpleActor](../../../simple/hooks/interfaces/SimpleActor.html "interface in simple.hooks.interfaces"), [SimpleIdentifiable](../../../simple/hooks/interfaces/SimpleIdentifiable.html "interface in simple.hooks.interfaces")
    
    Author:
    
    Seth Davis
    

*   *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[SimpleNpc](../../../simple/hooks/wrappers/SimpleNpc.html#SimpleNpc-net.runelite.api.NPC-)(net.runelite.api.NPC npc)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) [Deprecated Methods](javascript:show\(32\);) 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        `[click](../../../simple/hooks/wrappers/SimpleNpc.html#click-int-)(int option)` 
        
        `boolean`
        
        `[click](../../../simple/hooks/wrappers/SimpleNpc.html#click-java.lang.String-)(java.lang.String action)`
        
        This makes mouse click with option
        
        `boolean`
        
        `[click](../../../simple/hooks/wrappers/SimpleNpc.html#click-java.lang.String-java.lang.String-)(java.lang.String action, java.lang.String option)` 
        
        `java.lang.String[]`
        
        `[getActions](../../../simple/hooks/wrappers/SimpleNpc.html#getActions--)()`
        
        Returns Actions of the object
        
        `net.runelite.api.Actor`
        
        `[getActor](../../../simple/hooks/wrappers/SimpleNpc.html#getActor--)()` 
        
        `int`
        
        `[getAnimation](../../../simple/hooks/wrappers/SimpleNpc.html#getAnimation--)()` 
        
        `java.awt.geom.Rectangle2D`
        
        `[getClickBounds](../../../simple/hooks/wrappers/SimpleNpc.html#getClickBounds--)()` 
        
        `int`
        
        `[getHealth](../../../simple/hooks/wrappers/SimpleNpc.html#getHealth--)()`
        
        Deprecated. 
        
        `int`
        
        `[getHealthRatio](../../../simple/hooks/wrappers/SimpleNpc.html#getHealthRatio--)()` 
        
        `int`
        
        `[getId](../../../simple/hooks/wrappers/SimpleNpc.html#getId--)()`
        
        Returns id of the object
        
        `net.runelite.api.Actor`
        
        `[getInteracting](../../../simple/hooks/wrappers/SimpleNpc.html#getInteracting--)()` 
        
        `net.runelite.api.coords.WorldPoint`
        
        `[getLocation](../../../simple/hooks/wrappers/SimpleNpc.html#getLocation--)()`
        
        Position in world of object
        
        `java.lang.String`
        
        `[getName](../../../simple/hooks/wrappers/SimpleNpc.html#getName--)()`
        
        The name of said object
        
        `net.runelite.api.NPC`
        
        `[getNpc](../../../simple/hooks/wrappers/SimpleNpc.html#getNpc--)()` 
        
        `net.runelite.api.NPCComposition`
        
        `[getNpcDefinitions](../../../simple/hooks/wrappers/SimpleNpc.html#getNpcDefinitions--)()` 
        
        `net.runelite.api.HeadIcon`
        
        `[getOverhead](../../../simple/hooks/wrappers/SimpleNpc.html#getOverhead--)()` 
        
        `boolean`
        
        `[inCombat](../../../simple/hooks/wrappers/SimpleNpc.html#inCombat--)()` 
        
        `boolean`
        
        `[isAnimating](../../../simple/hooks/wrappers/SimpleNpc.html#isAnimating--)()` 
        
        `boolean`
        
        `[isDead](../../../simple/hooks/wrappers/SimpleNpc.html#isDead--)()` 
        
        `boolean`
        
        `[visibleOnScreen](../../../simple/hooks/wrappers/SimpleNpc.html#visibleOnScreen--)()` 
        
        *   ### Methods inherited from class simple.hooks.wrappers.[Clickable](../../../simple/hooks/wrappers/Clickable.html "class in simple.hooks.wrappers")
            
            `[clickOnMinimap](../../../simple/hooks/wrappers/Clickable.html#clickOnMinimap--), [getPointForType](../../../simple/hooks/wrappers/Clickable.html#getPointForType--), [turnTo](../../../simple/hooks/wrappers/Clickable.html#turnTo--), [validateInteractable](../../../simple/hooks/wrappers/Clickable.html#validateInteractable--)`
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface simple.hooks.interfaces.[SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")
            
            `[clickOnMinimap](../../../simple/hooks/interfaces/SimpleLocatable.html#clickOnMinimap--), [distanceTo](../../../simple/hooks/interfaces/SimpleLocatable.html#distanceTo-simple.hooks.interfaces.SimpleLocatable-), [within](../../../simple/hooks/interfaces/SimpleLocatable.html#within-simple.robot.utils.WorldArea-), [withinRange](../../../simple/hooks/interfaces/SimpleLocatable.html#withinRange-simple.hooks.interfaces.SimpleLocatable-int-)`

*   *   ### Constructor Detail
        
        *   #### SimpleNpc
            
            public SimpleNpc(net.runelite.api.NPC npc)
            
    
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
            
        
        *   #### getNpcDefinitions
            
            public net.runelite.api.NPCComposition getNpcDefinitions()
            
        
        *   #### getNpc
            
            public net.runelite.api.NPC getNpc()
            
        
        *   #### getActor
            
            public net.runelite.api.Actor getActor()
            
            Specified by:
            
            `[getActor](../../../simple/hooks/interfaces/SimpleActor.html#getActor--)` in interface `[SimpleActor](../../../simple/hooks/interfaces/SimpleActor.html "interface in simple.hooks.interfaces")`
            
        
        *   #### getLocation
            
            public net.runelite.api.coords.WorldPoint getLocation()
            
            Description copied from interface: `[SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html#getLocation--)`
            
            Position in world of object
            
            Specified by:
            
            `[getLocation](../../../simple/hooks/interfaces/SimpleLocatable.html#getLocation--)` in interface `[SimpleLocatable](../../../simple/hooks/interfaces/SimpleLocatable.html "interface in simple.hooks.interfaces")`
            
            Returns:
            
            \- Worldpoint of the locatable wrapper
            
        
        *   #### isDead
            
            public boolean isDead()
            
        
        *   #### inCombat
            
            public boolean inCombat()
            
        
        *   #### getInteracting
            
            public net.runelite.api.Actor getInteracting()
            
            Specified by:
            
            `[getInteracting](../../../simple/hooks/interfaces/SimpleActor.html#getInteracting--)` in interface `[SimpleActor](../../../simple/hooks/interfaces/SimpleActor.html "interface in simple.hooks.interfaces")`
            
        
        *   #### getAnimation
            
            public int getAnimation()
            
            Specified by:
            
            `[getAnimation](../../../simple/hooks/interfaces/SimpleActor.html#getAnimation--)` in interface `[SimpleActor](../../../simple/hooks/interfaces/SimpleActor.html "interface in simple.hooks.interfaces")`
            
        
        *   #### isAnimating
            
            public boolean isAnimating()
            
            Specified by:
            
            `[isAnimating](../../../simple/hooks/interfaces/SimpleActor.html#isAnimating--)` in interface `[SimpleActor](../../../simple/hooks/interfaces/SimpleActor.html "interface in simple.hooks.interfaces")`
            
        
        *   #### getActions
            
            public java.lang.String\[\] getActions()
            
            Description copied from interface: `[SimpleActionable](../../../simple/hooks/interfaces/SimpleActionable.html#getActions--)`
            
            Returns Actions of the object
            
            Specified by:
            
            `[getActions](../../../simple/hooks/interfaces/SimpleActionable.html#getActions--)` in interface `[SimpleActionable](../../../simple/hooks/interfaces/SimpleActionable.html "interface in simple.hooks.interfaces")`
            
            Returns:
            
            \- actions array of said object
            
        
        *   #### getOverhead
            
            public net.runelite.api.HeadIcon getOverhead()
            
        
        *   #### getHealth
            
            @Deprecated
            public int getHealth()
            
            Deprecated. 
            
        
        *   #### getHealthRatio
            
            public int getHealthRatio()
            
        
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
*   [Use](class-use/SimpleNpc.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/wrappers/SimpleLocalPlayer.html "class in simple.hooks.wrappers")
*   [Next Class](../../../simple/hooks/wrappers/SimpleObject.html "class in simple.hooks.wrappers")

*   [Frames](../../../index.html?simple/hooks/wrappers/SimpleNpc.html)
*   [No Frames](SimpleNpc.html)

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