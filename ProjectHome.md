# AndEngine - SVGTextureRegion Extension #

This project is an extension to [AndEngine](http://code.google.com/p/andengine/), the free Android 2D OpenGL Game Engine.

It allows you to render SVG files to Textures/Bitmaps during runtime.

## Examples ##
![http://andenginesvgtextureregionextension.googlecode.com/files/svg_chicks.png](http://andenginesvgtextureregionextension.googlecode.com/files/svg_chicks.png)
![http://andenginesvgtextureregionextension.googlecode.com/files/farmtower_sd_vs_hd.png](http://andenginesvgtextureregionextension.googlecode.com/files/farmtower_sd_vs_hd.png)

## Features ##
SVG Features not (yet) supported:
  * Filters (like blur)
  * Text (Simply convert text obejects to path objects!)

SVG Features supported:
  * Groups
    * Inheritance of group-transformations and attributes/properties
  * Colors
    * Opacity
    * Formats:
      * rgb(rrr,ggg,bbb)
      * #RRGGBB
      * #RGB
  * Gradients
    * Inheritance (lazy initialization, including transform/stop-inheritance)
    * Types:
      * LinearGradients
      * RadialGradients
  * Rectangles
    * RoundedRectangles
  * Circles
  * Ellipses
  * Polygons
  * Polylines
  * Paths
    * SubPaths
    * Fillrule
      * even-odd
    * Commands:
      * M/m - Move to
      * Z/z - Close path
      * L/l - Line to
      * H/h - Horizontal ine to
      * V/v - Vertical line to
      * C/c - Cubic bezier to
      * S/s - Smooth cubic bezier to
      * Q/q - Quadratic bezier to
      * T/t - Smooth quadratic bezier to
      * A/a - Arc to

## Supported formats ##
  * Optimized Inkscape-SVG (Recommended Format)
  * Inkscape SVG
  * Adobe Illustrator SVG

## Origin ##
This extension was inspired by the [svg-android](http://code.google.com/p/svg-android/) project which was released under the Apache License 2.0. By now **_this_** project has advanced so far, that there is actually no source-code shared with the original project anymore. Sourcecode files where the initial idea is still somewhat present are marked with the relevant @author annotation.