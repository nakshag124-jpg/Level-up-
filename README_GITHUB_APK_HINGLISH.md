# LEVEL UP APK - GitHub se build (phone se bhi ho sakta hai)

1. GitHub.com par Gmail se sign up/login karo.
2. New repository banao, naam `level-up-apk` rakho, Public ya Private kuch bhi.
3. Is project ZIP ko extract karo. `LevelUpAndroid` ke ANDAR ki saari files/folders repository ke root mein upload karo. `.github` folder bhi upload hona chahiye.
4. GitHub repository mein Actions tab kholo. `Build LEVEL UP APK` workflow select karke `Run workflow` dabao (ya main branch par upload karne ke baad automatic run hone do).
5. Build green/successful hone par workflow run kholo, neeche Artifacts section mein `LEVEL-UP-debug-APK` download karo.
6. ZIP extract karke `app-debug.apk` phone mein open/install karo. Android permission maange toh allow from this source enable karo.

Note: Ye debug APK hai, personal testing/install ke liye. Website/app ke native Android shell mein changes ke liye dobara build karna hoga.
