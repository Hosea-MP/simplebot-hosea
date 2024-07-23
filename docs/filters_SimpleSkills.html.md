SimpleSkills   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="SimpleSkills"; } } catch(err) { } //--> var methods = {"i0":10,"i1":10,"i2":10,"i3":10,"i4":10,"i5":10,"i6":10,"i7":10,"i8":10,"i9":10,"i10":10,"i11":10,"i12":10,"i13":10,"i14":10,"i15":10,"i16":10}; var tabs = {65535:\["t0","All Methods"\],2:\["t2","Instance Methods"\],8:\["t4","Concrete Methods"\]}; var altColor = "altColor"; var rowColor = "rowColor"; var tableTab = "tableTab"; var activeTableTab = "activeTableTab";

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleSkills.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/filters/SimpleShop.Amount.html "enum in simple.hooks.filters")
*   [Next Class](../../../simple/hooks/filters/SimpleSkills.Skills.html "enum in simple.hooks.filters")

*   [Frames](../../../index.html?simple/hooks/filters/SimpleSkills.html)
*   [No Frames](SimpleSkills.html)

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

Class SimpleSkills
------------------

*   java.lang.Object
*   *   simple.hooks.filters.SimpleSkills

*   * * *
    
      
    
    public class SimpleSkills
    extends java.lang.Object
    
    Created by Seth on Sep 29, 2019 at 12:58:50 AM.
    
    Author:
    
    Seth Davis
    

*   *   ### Nested Class Summary
        
        Nested Classes 
        
        Modifier and Type
        
        Class and Description
        
        `static class` 
        
        `[SimpleSkills.Skills](../../../simple/hooks/filters/SimpleSkills.Skills.html "enum in simple.hooks.filters")` 
        
    
    *   ### Constructor Summary
        
        Constructors 
        
        Constructor and Description
        
        `[SimpleSkills](../../../simple/hooks/filters/SimpleSkills.html#SimpleSkills-simple.robot.api.ClientContext-)([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)` 
        
    
    *   ### Method Summary
        
        All Methods [Instance Methods](javascript:show\(2\);) [Concrete Methods](javascript:show\(8\);) 
        
        Modifier and Type
        
        Method and Description
        
        `int`
        
        `[experience](../../../simple/hooks/filters/SimpleSkills.html#experience-int-)(int index)`
        
        returns your experience in the specified skill with index={index}
        
        `int`
        
        `[experience](../../../simple/hooks/filters/SimpleSkills.html#experience-simple.hooks.filters.SimpleSkills.Skills-)([SimpleSkills.Skills](../../../simple/hooks/filters/SimpleSkills.Skills.html "enum in simple.hooks.filters") skill)`
        
        returns your experience in the specified {skill}
        
        `int`
        
        `[experienceAt](../../../simple/hooks/filters/SimpleSkills.html#experienceAt-int-)(int level)`
        
        will return the experience needed for {level}
        
        `int[]`
        
        `[experiences](../../../simple/hooks/filters/SimpleSkills.html#experiences--)()`
        
        will return the players skill's xp array
        
        `int`
        
        `[level](../../../simple/hooks/filters/SimpleSkills.html#level-int-)(int index)`
        
        returns your boosted level in the specified skill with index={index}
        
        `int`
        
        `[level](../../../simple/hooks/filters/SimpleSkills.html#level-simple.hooks.filters.SimpleSkills.Skills-)([SimpleSkills.Skills](../../../simple/hooks/filters/SimpleSkills.Skills.html "enum in simple.hooks.filters") skill)`
        
        returns your boosted level in the specified {skill}
        
        `int`
        
        `[levelAt](../../../simple/hooks/filters/SimpleSkills.html#levelAt-int-)(int exp)`
        
        returns the level if your total exp in a stat was = {exp}
        
        `int[]`
        
        `[levels](../../../simple/hooks/filters/SimpleSkills.html#levels--)()`
        
        will return an array of the players boosted levels
        
        `int`
        
        `[realLevel](../../../simple/hooks/filters/SimpleSkills.html#realLevel-int-)(int index)`
        
        returns your none boosted real level in the specified skill with index={index}
        
        `int`
        
        `[realLevel](../../../simple/hooks/filters/SimpleSkills.html#realLevel-simple.hooks.filters.SimpleSkills.Skills-)([SimpleSkills.Skills](../../../simple/hooks/filters/SimpleSkills.Skills.html "enum in simple.hooks.filters") skill)`
        
        returns your none boosted real level in the specified {skill}
        
        `int[]`
        
        `[realLevels](../../../simple/hooks/filters/SimpleSkills.html#realLevels--)()` 
        
        `int`
        
        `[realLevels](../../../simple/hooks/filters/SimpleSkills.html#realLevels-int...-)(int... index)` 
        
        `int[]`
        
        `[SKILL_LEVELS](../../../simple/hooks/filters/SimpleSkills.html#SKILL_LEVELS--)()` 
        
        `int[]`
        
        `[SKILL_REAL_LEVELS](../../../simple/hooks/filters/SimpleSkills.html#SKILL_REAL_LEVELS--)()` 
        
        `int[]`
        
        `[SKILL_XPS](../../../simple/hooks/filters/SimpleSkills.html#SKILL_XPS--)()` 
        
        `int`
        
        `[totalExperience](../../../simple/hooks/filters/SimpleSkills.html#totalExperience--)()` 
        
        `int`
        
        `[totalLevel](../../../simple/hooks/filters/SimpleSkills.html#totalLevel--)()` 
        
        *   ### Methods inherited from class java.lang.Object
            
            `equals, getClass, hashCode, notify, notifyAll, toString, wait, wait, wait`

*   *   ### Constructor Detail
        
        *   #### SimpleSkills
            
            public SimpleSkills([ClientContext](../../../simple/robot/api/ClientContext.html "class in simple.robot.api") ctx)
            
    
    *   ### Method Detail
        
        *   #### experience
            
            public int experience([SimpleSkills.Skills](../../../simple/hooks/filters/SimpleSkills.Skills.html "enum in simple.hooks.filters") skill)
            
            returns your experience in the specified {skill}
            
            Parameters:
            
            `skill` -
            
            Returns:
            
        
        *   #### experience
            
            public int experience(int index)
            
            returns your experience in the specified skill with index={index}
            
            Parameters:
            
            `index` -
            
            Returns:
            
        
        *   #### experienceAt
            
            public int experienceAt(int level)
            
            will return the experience needed for {level}
            
            Parameters:
            
            `level` -
            
            Returns:
            
        
        *   #### experiences
            
            public int\[\] experiences()
            
            will return the players skill's xp array
            
            Returns:
            
        
        *   #### level
            
            public int level([SimpleSkills.Skills](../../../simple/hooks/filters/SimpleSkills.Skills.html "enum in simple.hooks.filters") skill)
            
            returns your boosted level in the specified {skill}
            
            Parameters:
            
            `skill` -
            
            Returns:
            
        
        *   #### level
            
            public int level(int index)
            
            returns your boosted level in the specified skill with index={index}
            
            Parameters:
            
            `index` -
            
            Returns:
            
        
        *   #### levelAt
            
            public int levelAt(int exp)
            
            returns the level if your total exp in a stat was = {exp}
            
            Parameters:
            
            `exp` -
            
            Returns:
            
        
        *   #### levels
            
            public int\[\] levels()
            
            will return an array of the players boosted levels
            
            Returns:
            
        
        *   #### realLevel
            
            public int realLevel([SimpleSkills.Skills](../../../simple/hooks/filters/SimpleSkills.Skills.html "enum in simple.hooks.filters") skill)
            
            returns your none boosted real level in the specified {skill}
            
            Parameters:
            
            `skill` -
            
            Returns:
            
        
        *   #### realLevel
            
            public int realLevel(int index)
            
            returns your none boosted real level in the specified skill with index={index}
            
            Parameters:
            
            `index` -
            
            Returns:
            
        
        *   #### realLevels
            
            public int realLevels(int... index)
            
        
        *   #### realLevels
            
            public int\[\] realLevels()
            
        
        *   #### SKILL\_XPS
            
            public int\[\] SKILL\_XPS()
            
        
        *   #### SKILL\_REAL\_LEVELS
            
            public int\[\] SKILL\_REAL\_LEVELS()
            
        
        *   #### SKILL\_LEVELS
            
            public int\[\] SKILL\_LEVELS()
            
        
        *   #### totalLevel
            
            public int totalLevel()
            
        
        *   #### totalExperience
            
            public int totalExperience()
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/SimpleSkills.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/filters/SimpleShop.Amount.html "enum in simple.hooks.filters")
*   [Next Class](../../../simple/hooks/filters/SimpleSkills.Skills.html "enum in simple.hooks.filters")

*   [Frames](../../../index.html?simple/hooks/filters/SimpleSkills.html)
*   [No Frames](SimpleSkills.html)

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