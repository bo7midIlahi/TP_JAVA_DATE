# 📅 Projet Java – Gestion d'une Date

## 📌 Description

Ce projet contient :

- Une **classe bibliothèque `date`** permettant de manipuler des dates simples.
- Une **classe `Main`** permettant de tester toutes les fonctionnalités de la bibliothèque.

L’objectif est de manipuler les dates sans utiliser les bibliothèques Java intégrées (comme `LocalDate`), afin de comprendre la logique interne des calculs de dates.

---


# 📘 1️⃣ Classe `date` (Bibliothèque)

## 🔹 Attributs

```java
public int jour;
public int mois;
public int an;
```
Ces variables représentent :

jour → le jour du mois

mois → le mois

an → l'année

## 🔹 Constructeur
```java
public date(int j, int m, int a)
```

Permet de créer une nouvelle date.
Exemple :
```java
date d = new date(15, 3, 2024);
```

## 🔹 Méthodes
✅ toString()
```java
public String toString()
```

Retourne la date sous la forme : jour/mois/année


✅ bissex()
```java
public boolean bissex()
```

Vérifie si l’année de l’objet est bissextile.

Règle :

divisible par 4

sauf si divisible par 100

sauf si divisible par 400

✅ nbJoursEntre(date d1, date d2)
```java
public long nbJoursEntre(date d1, date d2)
```
Calcule le nombre de jours entre deux dates.

Fonctionnement :

Si les deux dates sont dans la même année : différence = jours écoulés d2 - jours écoulés d1

Si les années sont différentes : jours restants de d1 + jours écoulés de d2 + jours des années intermédiaires

⚠ Hypothèse : d2 doit être postérieure à d1.

# 🧪 2️⃣ Classe date_main (Programme de test)

La classe Main contient la méthode :
```java
public static void main(String[] args)
```
Elle permet de tester toutes les fonctionnalités.

##🔹 Tests effectués
1️⃣ Affichage d’une date
```java
date d1 = new date(15, 3, 2024);
System.out.println(d1);
```

2️⃣ Vérification année bissextile
```java
System.out.println(d1.bissex());
```

3️⃣ Nombre de jours écoulés
```java
System.out.println(d1.nbJoursEcoules());
```

4️⃣ Nombre de jours restants
```java
System.out.println(d1.nbJoursRestants());
```

5️⃣ Différence entre deux dates (même année)
```java
date d2 = new date(25, 4, 2024);
d1.nbJoursEntre(d1, d2);
```

6️⃣ Différence entre deux dates (années différentes)
Exemple :
```java
date d3 = new date(10, 12, 2024);
date d4 = new date(15, 1, 2025);
```

## 📌 Remarques Importantes
-Il n’y a pas de validation des dates (ex: 45/13/2020 est accepté).

-La méthode nbJoursEntre suppose que la deuxième date est plus récente.

-Le nom de la classe devrait normalement commencer par une majuscule (Date) selon les conventions Java.

## ⭐ Conclusion

Ce mini-projet montre comment implémenter un système simple de gestion de dates sans utiliser les bibliothèques Java avancées.
