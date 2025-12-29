def call(String url, String branch) {
  echo "Code Cloning"
  git url: "${url}", branch "${branch}"
  echo "Cloning Successfully"
}
