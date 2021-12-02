Lien vers l'image docker : https://hub.docker.com/repository/docker/tlebreton/mongo_rest

Cette image a été créée grâce au Dockerfile présent dans ce projet.

Pour lancer les containers il faut utiliser docker-compose qui va utiliser l'image sur mon dépôt docker hub ainsi qu'une image mongodb.

C'est un simple micro-service rest pour gérer des produits.

On peut avoir la liste des produits présents dans la base avec le endpoint "/produits", de plus on peut ajouter des produits avec une méthode post sur "/produit".
