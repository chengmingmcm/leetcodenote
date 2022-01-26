@echo off

git add .
set /p input=请输入commit的名称：

echo 您的commit是：%input%

pause

git commit -m '%input%'


@echo on
git push origin main


pause