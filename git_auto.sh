#!/bin/bash

echo "按回车键执行 git status"
read -n 1
git status

echo "按回车键执行 git add ."
read -n 1
git add .

echo "按回车键执行 git commit -m update"
read -n 1
git commit -m "update"

echo "按回车键执行 git push"
read -n 1
git push

echo "所有Git操作已完成！"
read -n 1