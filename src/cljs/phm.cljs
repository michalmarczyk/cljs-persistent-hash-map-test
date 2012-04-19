(ns phm)

(defn ^:export empty-obj-map []
  cljs.core.ObjMap/EMPTY)

(defn ^:export empty-hash-map []
  cljs.core.HashMap/EMPTY)

(defn ^:export empty-persistent-hash-map []
  cljs.core.PersistentHashMap/EMPTY)

(defn ^:export assocwrapper [m k v]
  (assoc m k v))

(defn ^:export dissocwrapper [m k]
  (dissoc m k))

(defn ^:export getwrapper [m k]
  (get m k))

(defn ^:export getwrapperdefault [m k not-found]
  (get m k not-found))

(defn ^:export invokewrapper [m k]
  (m k))

(defn ^:export invokewrapperdefault [m k not-found]
  (m k not-found))

(defn ^:export transientwrapper [m]
  (transient m))

(defn ^:export persistentwrapper [tm]
  (persistent! tm))

(defn ^:export assocbangwrapper [tm k v]
  (assoc! tm k v))
