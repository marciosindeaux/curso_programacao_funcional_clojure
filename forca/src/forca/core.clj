(ns forca.core
  (:gen-class))

(def total-de-vidas 6)

(defn perdeu [] (print "\nVoce Perdeu\n") )
(defn ganhou [] (print "\nVoce Ganhou\n") )


(defn conferencia-letras [palavras acerto]
  (remove (
      fn [letra] 
        (contains? acerto (str letras))
    ) 
    palavras
  )
)

(defn acertou-palavra-toda? [palavra acertos] 
  (empty? (conferencia-letras palavra acerto))
)


(defn jogo [vidas palavra acertos]
  (if (= vidas 0) 
      (perdeu)
    (if (acertou-palavra-toda? palavra acertos)
      (ganhou)
      (print "Chuta amigo !")
    )
  )
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
