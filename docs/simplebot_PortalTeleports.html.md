PortalTeleports   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="PortalTeleports"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":42,"i3":42}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\],32:\["t6","Deprecated Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/PortalTeleports.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/Pathing.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/Projectiles.html "class in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/PortalTeleports.html)
*   [No Frames](PortalTeleports.html)

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

Class PortalTeleports
---------------------

*   java.lang.Object
*   *   simple.hooks.simplebot.PortalTeleports

*   * * *
    
      
    
    public class PortalTeleports
    extends java.lang.Object
    
    Created by Seth on Nov 18, 2019 at 9:29:14 PM.
    
    Author:
    
    Seth Davis
    

*   *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[PortalTeleports](../../../simple/hooks/simplebot/PortalTeleports.html#PortalTeleports-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) [Deprecated Methods](javascript:show\(32\);) 
        
        Modifier and Type
        
        Method and Description
        
        `boolean`
        
        `[portalOpen](../../../simple/hooks/simplebot/PortalTeleports.html#portalOpen--)()`
        
        returns if the server teleporter widget is open {true} = open, {false} = closed
        
        `boolean`
        
        `[sendTeleport](../../../simple/hooks/simplebot/PortalTeleports.html#sendTeleport-java.lang.String-java.lang.String-)(java.lang.String category, java.lang.String teleport)`
        
        will return if a teleport has been successfully sent, {true} = success, {false} = failed
        
        `void`
        
        `[sendZenyteTeleport](../../../simple/hooks/simplebot/PortalTeleports.html#sendZenyteTeleport-java.lang.String-java.lang.String-)(java.lang.String category, java.lang.String teleport)`
        
        Deprecated. 
        
        `boolean`
        
        `[zenytePortalOpen](../../../simple/hooks/simplebot/PortalTeleports.html#zenytePortalOpen--)()`
        
        Deprecated. 
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Constructor Detail
        
        *   #### PortalTeleports
            
            public PortalTeleports([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)
            
    
    *   ### Method Detail
        
        *   #### portalOpen
            
            public boolean portalOpen()
            
            returns if the server teleporter widget is open {true} = open, {false} = closed
            
            Returns:
            
        
        *   #### sendTeleport
            
            public boolean sendTeleport(java.lang.String category,
                                        java.lang.String teleport)
            
            will return if a teleport has been successfully sent, {true} = success, {false} = failed
            
            Parameters:
            
            `category` -
            
            `teleport` -
            
            Returns:
            
        
        *   #### zenytePortalOpen
            
            @Deprecated
            public boolean zenytePortalOpen()
            
            Deprecated. 
            
        
        *   #### sendZenyteTeleport
            
            @Deprecated
            public void sendZenyteTeleport(java.lang.String category,
                                                        java.lang.String teleport)
            
            Deprecated. 
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/PortalTeleports.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/Pathing.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/Projectiles.html "class in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/PortalTeleports.html)
*   [No Frames](PortalTeleports.html)

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