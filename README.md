# fulcro-material-ui-wrapper

Wrapper of https://material-ui.com/ for fulcro

Bindings of [MUI](https://mui.com/) (former Material UI) for [fulcro](https://github.com/fulcrologic/fulcro).

Use this in your deps.edn:

```clojure
com.github.mrebbinghaus/fulcro-material-ui-wrapper
{:git/url "https://github.com/MrEbbinghaus/fulcro-material-ui-wrapper"
 :sha "<latest-sha>"}
```

And prefer ES modules above CommonJS. Read about this in
the [ShadowCLJS Docs](https://shadow-cljs.github.io/docs/UsersGuide.html#js-entry-keys)

```clojure
{:js-options {:entry-keys ["module" "browser" "main"]}}
```

## Sample

JavaScript:

```js
<Typography variant="h6" color="inherit" noWrap className={classes.toolbarTitle}>
```

ClojureScript
```cljs
(mui/typography {:variant "h6" :color "inherit" :noWrap true :className "toolbarTitle"} "")
```

## WARNING!

This repo is far from complete. I use it for my own projects and usually only add what I need myself. Feel free to open
an issue or merge request, when you are interested in extending it.

[This project](https://github.com/hhucn/decide3) uses this bindings nearly everywhere.
Have a look at it until I want to write some doc.
