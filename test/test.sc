(import (enchantment py call)
        (numpy numpy))



(py-init)




(define get-sin
    (lambda (lst)
        (py-list->vector 'float
            (np-tolist
                (np-sin
                    (py-div
                        (py-mul pi 
                            (np-array
                                (list->py-list 'int lst)))
                        (int 180)))))))

(display (get-sin '(1 2 3 4 5 6 7 8)))
(newline)
(py-fin)


(exit)
