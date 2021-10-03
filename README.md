# fulcro-material-ui-wrapper

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

## WARNING!

This repo is far from complete. I use it for my own projects and usually only add what I need myself. Feel free to open
an issue or merge request, when you are interested in extending it.

This repo makes heavy use of this lib: https://github.com/hhucn/decide3
Have a look until I want to write a better doc.
