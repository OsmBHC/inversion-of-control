# Inversion of Control (IoC) avec Spring

Ce projet est un travail pratique sur l'injection des dépendances en Java, basé sur trois méthodes différentes :
- **Instanciation statique**
- **Instanciation dynamique**
- **Utilisation du framework Spring**

---

## 📌 1. Instructions Git pour commencer

Avant de commencer à coder, assure-toi d'avoir cloné le projet et bien configuré Git sur ton environnement local.

```sh
# 1️⃣ Cloner le projet
git clone https://github.com/OsmBHC/Inversion-of-control.git
# 2️⃣ Se déplacer dans le dossier du projet
cd Inversion-of-control
# 3️⃣ Vérifier l'état du projet
git status
```
Si tu modifies du code, voici comment l'ajouter et le pousser sur GitHub :
```sh
# 1️⃣ Ajouter les fichiers modifiés
git add .
# 2️⃣ Commiter les fichiers ajoutés
git commit -m "Message du commit"
# 3️⃣ Pousser les fichiers commités
git push origin main
```

---

## 🎯 2. Objectifs du TP

L'objectif de ce TP est de comprendre et implémenter l'injection des dépendances en Java à travers différentes méthodes.

### 🔹 Partie 1 : Création des interfaces et implémentations

1️⃣ Créer l’interface `IDao` avec une méthode `getData()`.  
2️⃣ Créer une implémentation `DaoImpl` de cette interface.  
3️⃣ Créer l’interface `IMetier` avec une méthode `calcul()`.  
4️⃣ Créer une implémentation `MetierImpl` de cette interface en utilisant le couplage faible.

### 🔹 Partie 2 : Injection des dépendances

💡 Trois méthodes d’injection des dépendances sont mises en place :

👉 **Par instanciation statique** (directement dans le code).  
👉 **Par instanciation dynamique** (via la réflexion).  
👉 **En utilisant le Framework Spring** :
- **Version XML**
- **Version Annotations**  

---

## 🛠 3. Technologies utilisées

- **Java** (JDK 8 ou plus)
- **Spring Framework**
- **Maven** (pour la gestion des dépendances)
- **Git** (pour la gestion du code source)  

---

## 📂 4. Structure du projet

```plaintext
Bdcc_ioc/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── dao/
│   │   │   │   ├── IDao.java
│   │   │   │   ├── DaoImpl.java
│   │   │   ├── ext/
│   │   │   │   ├── DaoImplV2.java
│   │   │   ├── metier/
│   │   │   │   ├── IMetier.java
│   │   │   │   ├── MetierImpl.java
│   │   │   ├── presentation/
│   │   │   │   ├── PresentationV1.java
│   │   │   │   ├── PresentationV2.java
│   │   │   │   ├── PresentationV3.java
│   │   │   │   ├── PresentationV4.java
│   │   ├── resources/
│   │   │   ├── config.xml
│   ├── test/
│   │   ├── java/
├── .gitignore
├── pom.xml
├── README.md
├── config.txt
```
---

## 📌 5. Organisation du projet

Le projet est structuré en trois packages principaux :

- 📁 **dao** → Contient les classes liées à l’accès aux données.
- 📁 **metier** → Contient la logique métier.
- 📁 **presentation** → Contient les classes pour tester et afficher les résultats.  
