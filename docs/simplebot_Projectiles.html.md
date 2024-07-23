Projectiles   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="Projectiles"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Projectiles.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/PortalTeleports.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/ScriptPaint.html "class in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Projectiles.html)
*   [No Frames](Projectiles.html)

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

Class Projectiles
-----------------

*   java.lang.Object
*   *   [simple.hooks.queries.SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")<[SimpleIdQuery](../../../simple/hooks/queries/SimpleIdQuery.html "class in simple.hooks.queries")<K>,K>
    *   *   [simple.hooks.queries.SimpleIdQuery](../../../simple/hooks/queries/SimpleIdQuery.html "class in simple.hooks.queries")<[SimpleProjectile](../../../simple/hooks/wrappers/SimpleProjectile.html "class in simple.hooks.wrappers")\>
        *   *   simple.hooks.simplebot.Projectiles

*   All Implemented Interfaces:
    
    java.lang.Iterable<[SimpleProjectile](../../../simple/hooks/wrappers/SimpleProjectile.html "class in simple.hooks.wrappers")\>
    
    * * *
    
      
    
    public class Projectiles
    extends [SimpleIdQuery](../../../simple/hooks/queries/SimpleIdQuery.html "class in simple.hooks.queries")<[SimpleProjectile](../../../simple/hooks/wrappers/SimpleProjectile.html "class in simple.hooks.wrappers")\>
    
    Created by Seth on Nov 18, 2019 at 9:29:11 PM.
    
    Author:
    
    Seth Davis
    

*   *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[Projectiles](../../../simple/hooks/simplebot/Projectiles.html#Projectiles-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `java.util.List<net.runelite.api.Projectile>`
        
        `[getActiveProjectiles](../../../simple/hooks/simplebot/Projectiles.html#getActiveProjectiles--)()`
        
        will return a list of all projectiles in your client
        
        `boolean`
        
        `[projectileActive](../../../simple/hooks/simplebot/Projectiles.html#projectileActive-int-)(int id)`
        
        will return if a projectile with the id {id} is currently in your client
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleIdQuery](../../../simple/hooks/queries/SimpleIdQuery.html "class in simple.hooks.queries")
            
            `[filter](../../../simple/hooks/queries/SimpleIdQuery.html#filter-int...-)`
        
        *   ### Methods inherited from class simple.hooks.queries.[SimpleQuery](../../../simple/hooks/queries/SimpleQuery.html "class in simple.hooks.queries")
            
            `[contains](../../../simple/hooks/queries/SimpleQuery.html#contains-K-), [filter](../../../simple/hooks/queries/SimpleQuery.html#filter-java.util.function.Predicate-), [isEmpty](../../../simple/hooks/queries/SimpleQuery.html#isEmpty--), [iterator](../../../simple/hooks/queries/SimpleQuery.html#iterator--), [next](../../../simple/hooks/queries/SimpleQuery.html#next--), [peekNext](../../../simple/hooks/queries/SimpleQuery.html#peekNext--), [populate](../../../simple/hooks/queries/SimpleQuery.html#populate--), [population](../../../simple/hooks/queries/SimpleQuery.html#population--), [reverse](../../../simple/hooks/queries/SimpleQuery.html#reverse--), [shuffle](../../../simple/hooks/queries/SimpleQuery.html#shuffle--), [size](../../../simple/hooks/queries/SimpleQuery.html#size--), [sort](../../../simple/hooks/queries/SimpleQuery.html#sort-java.util.Comparator-), [toStream](../../../simple/hooks/queries/SimpleQuery.html#toStream--)`
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`
        
        *   ### Methods inherited from interface java.lang.Iterable
            
            `forEach, spliterator`

*   *   ### Constructor Detail
        
        *   #### Projectiles
            
            public Projectiles([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)
            
    
    *   ### Method Detail
        
        *   #### projectileActive
            
            public boolean projectileActive(int id)
            
            will return if a projectile with the id {id} is currently in your client
            
            Parameters:
            
            `id` -
            
            Returns:
            
        
        *   #### getActiveProjectiles
            
            public java.util.List<net.runelite.api.Projectile> getActiveProjectiles()
            
            will return a list of all projectiles in your client
            
            Returns:
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/Projectiles.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/simplebot/PortalTeleports.html "class in simple.hooks.simplebot")
*   [Next Class](../../../simple/hooks/simplebot/ScriptPaint.html "class in simple.hooks.simplebot")

*   [Frames](../../../index.html?simple/hooks/simplebot/Projectiles.html)
*   [No Frames](Projectiles.html)

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