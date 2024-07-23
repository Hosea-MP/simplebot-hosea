   :root { --c-bg: #fff; } html.dark { --c-bg: #22272e; } html, body { background-color: var(--c-bg); } const userMode = localStorage.getItem('vuepress-color-scheme') const systemDarkMode = window.matchMedia && window.matchMedia('(prefers-color-scheme: dark)').matches if (userMode === 'dark' || (userMode !== 'light' && systemDarkMode)) { document.documentElement.classList.toggle('dark', true) } SimpleBot RuneLite API Documentation | SimpleBot Docs    .medium-zoom-overlay{position:fixed;top:0;right:0;bottom:0;left:0;opacity:0;transition:opacity .3s;will-change:opacity}.medium-zoom--opened .medium-zoom-overlay{cursor:pointer;cursor:zoom-out;opacity:1}.medium-zoom-image{cursor:pointer;cursor:zoom-in;transition:transform .3s cubic-bezier(.2,0,.2,1)!important}.medium-zoom-image--hidden{visibility:hidden}.medium-zoom-image--opened{position:relative;cursor:pointer;cursor:zoom-out;will-change:transform}

[![SimpleBot Docs](/docs-api/assets/sb-logo.png)SimpleBot Docs](/docs-api/)

[Home](/docs-api/)

[Guide](/docs-api/guide/)

[Javadocs open in new window](https://simplebot.org/docs/)

[SimpleBot open in new window](https://simplebot.org/)

Search

⌃K

[Home](/docs-api/)

[Guide](/docs-api/guide/)

[Javadocs open in new window](https://simplebot.org/docs/)

[SimpleBot open in new window](https://simplebot.org/)

*   Guide
    
    *   [SimpleBot RuneLite API Documentation](/docs-api/guide/)
        *   [Table of Contents](#table-of-contents)
        *   [Introduction](#introduction)
        *   [Getting Started](#getting-started)
            *   [Prerequisites](#prerequisites)
            *   [Signing Up for an Account](#signing-up-for-an-account)
            *   [Installing the SimpleBot Launcher](#installing-the-simplebot-launcher)
    *   [Query API](/docs-api/guide/query.html)
    *   [Interacting with NPCs](/docs-api/guide/npcs.html)
    *   [Interacting with Objects](/docs-api/guide/objects.html)
    *   [Interacting with Items and Inventory](/docs-api/guide/items.html)
    *   [Working with Widgets](/docs-api/guide/widgets.html)
    *   [Walking and Movement](/docs-api/guide/movement.html)
    *   [Implementing Sleep Conditions and Delays](/docs-api/guide/sleeps-delays.html)
    *   [Best Practices](/docs-api/guide/best-practices.html)
    *   [Examples](/docs-api/guide/examples.html)

[SimpleBot RuneLite API Documentation](#simplebot-runelite-api-documentation)
=============================================================================

Welcome to the official documentation for the SimpleBot RuneLite API. This comprehensive guide is designed for developers looking to automate tasks in Old School RuneScape (OSRS) Private Servers using the SimpleBot API for RuneLite. Below, you'll find detailed instructions on how to interact with various game elements such as NPCs, objects, items, widgets, and more.

[Table of Contents](#table-of-contents)
---------------------------------------

*   [Introduction](#introduction)
*   [Getting Started](#getting-started)
*   [Query API](/docs-api/guide/query.html)
*   [Interacting with NPCs](/docs-api/guide/npcs.html)
*   [Interacting with Objects](/docs-api/guide/objects.html)
*   [Interacting with Items and Inventory](/docs-api/guide/items.html)
*   [Working with Widgets](/docs-api/guide/widgets.html)
*   [Walking and Movement](/docs-api/guide/movement.html)
*   [Implementing Sleeps and Delays](/docs-api/guide/sleeps-delays.html)
*   [Best Practices](/docs-api/guide/best-practices.html)
*   [Examples](/docs-api/guide/examples.html)

[Introduction](#introduction)
-----------------------------

This documentation aims to provide all necessary information to effectively use the SimpleBot API. Whether you are creating scripts for personal use or for wider distribution, this guide will help you understand the ins and outs of automated interactions within OSRS.

[Getting Started](#getting-started)
-----------------------------------

To begin using the SimpleBot API, ensure you have signed up for an account on the SimpleBot website located at [simplebot.orgopen in new window](https://simplebot.org/forums). Once you have an account, you can download the SimpleBot Launcher and install the SimpleBot API by launching a server client. This section will guide you through the setup process and initial configuration.

### [Prerequisites](#prerequisites)

*   [A SimpleBot Accountopen in new window](https://simplebot.org/forums)
*   [The SimpleBot Launcheropen in new window](https://simplebot.org/forums)
*   The SimpleBot API (Included with the SimpleBot Launcher, once you launch a server client)

### [Signing Up for an Account](#signing-up-for-an-account)

To sign up for a SimpleBot account, visit the [SimpleBot websiteopen in new window](https://simplebot.org/forums) and create an account. You will need this account to access the SimpleBot Launcher and API.

### [Installing the SimpleBot Launcher](#installing-the-simplebot-launcher)

Last Updated: 4/27/2024, 11:13:39 PM

Contributors: the-reminisce

[

Next

Query API

](/docs-api/guide/query.html)