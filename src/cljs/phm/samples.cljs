(ns phm.samples)

(defn n->m [m n]
  (apply assoc m (interleave (range n) (range n))))

(defn n->phm [n]
  (n->m cljs.core.PersistentHashMap/EMPTY n))

(defn n->pam [n]
  (n->m cljs.core.PersistentArrayMap/EMPTY n))

(defn n->strm [m n]
  (apply assoc m (interleave (map (partial str "foo") (range n)) (range n))))

(defn n->strom [n]
  (n->strm cljs.core.ObjMap/EMPTY n))

(defn n->strphm [n]
  (n->strphm cljs.core.PersistentHashMap/EMPTY n))

(defn n->strpam [n]
  (n->strphm cljs.core.PersistentArrayMap/EMPTY n))

(def test-range (range 4 65 4))

(def ^:export phms
  (apply js-obj (mapcat (juxt identity n->phm) test-range)))

(def ^:export pams
  (apply js-obj (mapcat (juxt identity n->pam) test-range)))

(def ^:export stroms
  (apply js-obj (mapcat (juxt identity n->strom) test-range)))

(def ^:export strphms
  (apply js-obj (mapcat (juxt identity n->strphm) test-range)))

(def ^:export strpams
  (apply js-obj (mapcat (juxt identity n->strpam) test-range)))
