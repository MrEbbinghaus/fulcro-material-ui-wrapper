# fulcro-material-ui-wrapper

Wrapper of https://material-ui.com/ for fulcro

Use this in your deps.edn
```clojure
com.github.mrebbinghaus/fulcro-material-ui-wrapper
{:git/url "https://github.com/MrEbbinghaus/fulcro-material-ui-wrapper"
 :sha "<latest-sha>"}
```

# Sample

JavaScript:

```js
<Typography variant="h6" color="inherit" noWrap className={classes.toolbarTitle}>
```

ClojureScript
```cljs
(mui/typography {:variant "h6" :color "inherit" :noWrap true :className "toolbarTitle"} "")
```

# WARNING!
This repo is far from complete. I use it for my own projects and usually only add what I need myself.
Feel free to open an issue or merge request, when you are interested in extending it.

Have a peek here: https://github.com/MrEbbinghaus/Todoish/blob/b1fd5f9d43e6f9ffbd32515086b07f3951dd2125/src/main/todoish/models/todo.cljs#L45
Until I want to write a better doc.
