# ProjetPM

Ce readme contient les éléments importants de mon projet de programmation mobile qui consistait en la création d'une application mobile qui devait respecter un cahier des charges bien précis: 

- un écran avec une liste d'éléments
- un écran avec le détail d'un élément 
- Appel WebService à une API Rest
- Stockage de données en cache

Pour obtenir une meilleure note, je pouvais améliorer le design de l'application, ou encore modifier l'architecture, inclure des notifications...

Ainsi, j'ai pu respecter le cahier des charges comme il a été demandé: 

- un écran avec une liste d'éléments (la liste des différents Pokémon ainsi qu'une image du personnage correspondant pour que l'utilisateur puisse avoir une visualisation du pokémon séléctionné): 

![image](https://user-images.githubusercontent.com/81537315/120069821-2b54e000-c088-11eb-9a89-007d23604fe8.png)


- un écran avec le détail d'un élément (lorsque l'on appuie sur l'un des pokémon, nous sommes dirigés vers un autre écran qui donne des informations sur le Pokemon sélectionné) 

Ici, j'utilise l'API Rest PokeApi comme celle du professeur. Ainsi, lorsque l'on appuie sur l'un des personnages nous obtenons le nom du personnage sur un autre écran comme ci-dessous: 

<img width="562" alt="detail element" src="https://user-images.githubusercontent.com/81537315/120070075-80452600-c089-11eb-8cc6-ed481e244b8e.PNG">

J'ai également réalisé l'Appel WebService à l'API Rest ainsi que le stockage de données en cache que vous pourrez voir dans le code.

J'ai ajouté d'autres options: 

- J'ai amélioré le design en ajoutant un fond violet qui est ma couleur préféré et qui je trouve se marier bien avec les images des Pokémons (voir première photo).

- J'ai également modifié l'architecture en mettant en place le Singleton et j'ai suivi l'architecture MVVM recommandée par Google qui je trouve est un très bon choix d'architecture qui convient parfaitement à mon projet. 

- J'ai également fait du Gitflow puisque qu'au début je voulais utiliser une API Rest sur les personnages d'Harry Potter (je suis une grande fan !!!) mais malheureusement je n'ai pas réussi à afficher mes personnages et je me suis donc décidée de prendre la même API Rest que le professeur a utilisé qui est celle des Pokemons. Ainsi j'ai donc du créer deux branches pour ne pas perdre ce que j'avais fait pour l'API Rest de Harry Potter. 












