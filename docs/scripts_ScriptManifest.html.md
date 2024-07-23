ScriptManifest   <!-- try { if (location.href.indexOf('is-external=true') == -1) { parent.document.title="ScriptManifest"; } } catch(err) { } //-->

JavaScript is disabled on your browser.

[Skip navigation links](#skip.navbar.top "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/ScriptManifest.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/scripts/LoopingScript.html "interface in simple.hooks.scripts")
*   Next Class

*   [Frames](../../../index.html?simple/hooks/scripts/ScriptManifest.html)
*   [No Frames](ScriptManifest.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_top"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Field | 
*   [Required](#annotation.type.required.element.summary) | 
*   [Optional](#annotation.type.optional.element.summary)

*   Detail: 
*   Field | 
*   [Element](#annotation.type.element.detail)

simple.hooks.scripts

Annotation Type ScriptManifest
------------------------------

*   * * *
    
      
    
    @Retention(value=RUNTIME)
    public @interface ScriptManifest
    

*   *   ### Required Element Summary
        
        Required Elements 
        
        Modifier and Type
        
        Required Element and Description
        
        `java.lang.String`
        
        `[author](../../../simple/hooks/scripts/ScriptManifest.html#author--)` 
        
        `[Category](../../../simple/hooks/scripts/Category.html "enum in simple.hooks.scripts")`
        
        `[category](../../../simple/hooks/scripts/ScriptManifest.html#category--)` 
        
        `java.lang.String`
        
        `[description](../../../simple/hooks/scripts/ScriptManifest.html#description--)` 
        
        `java.lang.String`
        
        `[discord](../../../simple/hooks/scripts/ScriptManifest.html#discord--)` 
        
        `java.lang.String`
        
        `[name](../../../simple/hooks/scripts/ScriptManifest.html#name--)` 
        
        `java.lang.String[]`
        
        `[servers](../../../simple/hooks/scripts/ScriptManifest.html#servers--)` 
        
        `java.lang.String`
        
        `[version](../../../simple/hooks/scripts/ScriptManifest.html#version--)` 
        
    
    *   ### Optional Element Summary
        
        Optional Elements 
        
        Modifier and Type
        
        Optional Element and Description
        
        `boolean`
        
        `[premium](../../../simple/hooks/scripts/ScriptManifest.html#premium--)` 
        
        `int`
        
        `[premiumCode](../../../simple/hooks/scripts/ScriptManifest.html#premiumCode--)` 
        
        `int`
        
        `[scriptTimeout](../../../simple/hooks/scripts/ScriptManifest.html#scriptTimeout--)` 
        
        `boolean`
        
        `[sponsor](../../../simple/hooks/scripts/ScriptManifest.html#sponsor--)` 
        
        `boolean`
        
        `[vip](../../../simple/hooks/scripts/ScriptManifest.html#vip--)` 
        

*   *   ### Element Detail
        
        *   #### author
            
            public abstract java.lang.String author
            
    
    *   *   #### name
            
            public abstract java.lang.String name
            
    
    *   *   #### category
            
            public abstract [Category](../../../simple/hooks/scripts/Category.html "enum in simple.hooks.scripts") category
            
    
    *   *   #### version
            
            public abstract java.lang.String version
            
    
    *   *   #### description
            
            public abstract java.lang.String description
            
    
    *   *   #### discord
            
            public abstract java.lang.String discord
            
    
    *   *   #### servers
            
            public abstract java.lang.String\[\] servers
            
    
    *   *   #### vip
            
            public abstract boolean vip
            
            Default:
            
            false
            
    
    *   *   #### sponsor
            
            public abstract boolean sponsor
            
            Default:
            
            false
            
    
    *   *   #### premium
            
            public abstract boolean premium
            
            Default:
            
            false
            
    
    *   *   #### premiumCode
            
            public abstract int premiumCode
            
            Default:
            
            \-1
            
    
    *   *   #### scriptTimeout
            
            public abstract int scriptTimeout
            
            Default:
            
            \-1
            

[Skip navigation links](#skip.navbar.bottom "Skip navigation links")

*   [Overview](../../../overview-summary.html)
*   [Package](package-summary.html)
*   Class
*   [Use](class-use/ScriptManifest.html)
*   [Tree](package-tree.html)
*   [Deprecated](../../../deprecated-list.html)
*   [Index](../../../index-files/index-1.html)
*   [Help](../../../help-doc.html)

*   [Prev Class](../../../simple/hooks/scripts/LoopingScript.html "interface in simple.hooks.scripts")
*   Next Class

*   [Frames](../../../index.html?simple/hooks/scripts/ScriptManifest.html)
*   [No Frames](ScriptManifest.html)

*   [All Classes](../../../allclasses-noframe.html)

<!-- allClassesLink = document.getElementById("allclasses\_navbar\_bottom"); if(window==top) { allClassesLink.style.display = "block"; } else { allClassesLink.style.display = "none"; } //-->

*   Summary: 
*   Field | 
*   [Required](#annotation.type.required.element.summary) | 
*   [Optional](#annotation.type.optional.element.summary)

*   Detail: 
*   Field | 
*   [Element](#annotation.type.element.detail)